package com.example.persistence;

import java.util.List;

import com.example.domain.HVO;
import com.example.domain.SearchCriteria;

public interface HDAO {
	public void insert(HVO vo) throws Exception;
	public List<HVO> list() throws Exception;//hsearch 목록
	public List<HVO> slist(SearchCriteria cri) throws Exception;//hsearch 목록에서 keyword 검색
	public HVO read(String h_code) throws Exception;
	public List<HVO> klist(SearchCriteria cri) throws Exception;//hsearch 목록에서 searchType,Keyword 검색
}
