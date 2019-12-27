package com.example.persistence;

import java.util.List;

import com.example.domain.HosVO;
import com.example.domain.SearchCriteria;

public interface HosDAO {
	public List<HosVO> hlist(SearchCriteria cri) throws Exception;
	public void hinsert(HosVO vo) throws Exception;
}
