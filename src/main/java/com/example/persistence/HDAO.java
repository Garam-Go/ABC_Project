package com.example.persistence;

import java.util.List;

import com.example.domain.HVO;
import com.example.domain.SearchCriteria;

public interface HDAO {
	public List<HVO> hlist(SearchCriteria cri) throws Exception;
	public void hinsert(HVO vo) throws Exception;
}
