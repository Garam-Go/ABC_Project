package com.example.persistence;

import java.util.List;

import com.example.domain.MyBasHVO;
import com.example.domain.SearchCriteria;

public interface MBHDAO {
	//저장된 병원의 리스트
	public List<MyBasHVO> list(String mhid,SearchCriteria cri) throws Exception;
	//최근 열어본 병원의 정보 저장
	public void insert(MyBasHVO vo) throws Exception;
	//병원 리뷰 저장
	
}
