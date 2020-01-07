package com.example.persistence;

import java.util.List;

import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.ReviewVO;
import com.example.domain.SearchCriteria;

public interface HDAO {
	
	
	public void insert(HVO vo) throws Exception;
	//지도 빼고 다 저장
	public void tinsert(HVO vo) throws Exception;	
	public List<HVO> list() throws Exception; //크롤링 데이터 hsearch에 저장한 목록 출력
	public List<HVO> slist(SearchCriteria cri) throws Exception;//크롤링 데이터 hsearch에 저장한 목록 출력 keyword 검색 가능
	public HVO read(String h_code) throws Exception;//코드,이름,진료 시간 read

	public void update(HVO vo)throws Exception; //진료과목 입력하기
	/*    병원 리뷰    */
	public void reviewinsert(ReviewVO vo) throws Exception;
		

}
