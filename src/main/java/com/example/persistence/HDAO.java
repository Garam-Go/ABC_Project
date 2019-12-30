package com.example.persistence;

import java.util.List;

import com.example.domain.HVO;
import com.example.domain.SearchCriteria;

public interface HDAO {
	public void rinsert(HVO vo) throws Exception;
	
	public void insert(HVO vo) throws Exception;
	
	//지도 빼고 다 저장
	public void tinsert(HVO vo) throws Exception;
	
	public List<HVO> list() throws Exception; //크롤링 데이터 hsearch에 저장한 목록 출력
	public List<HVO> slist(SearchCriteria cri) throws Exception;//크롤링 데이터 hsearch에 저장한 목록 출력 keyword 검색 가능
	public HVO read(String h_code) throws Exception;
	
	
	public void update(HVO vo)throws Exception; //크롤링 데이터를 리드하는 데이터 
	
	
	
}
