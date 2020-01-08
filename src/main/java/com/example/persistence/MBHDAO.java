package com.example.persistence;

import java.util.List;

import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.SearchCriteria;

public interface MBHDAO {
	//저장된 병원의 리스트
	public List<MBasketHVO> list(String mhid,SearchCriteria cri) throws Exception;
	//최근 열어본 병원의 정보 저장
	public void insert(MBasketHVO vo) throws Exception;
	//저장병원 리스트 토탈
	public int total(String mhid);
	
	//저장된 병원의 코드를 이용한 병원불러오기
	public HVO hread(String h_code) throws Exception;
}
