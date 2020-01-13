package com.example.persistence;

import java.util.List;

import com.example.domain.HsearchVO;
import com.example.domain.SearchCriteria;

public interface HsearchDAO {
	public List<HsearchVO> hlist(SearchCriteria cri) throws Exception;
	public int htotal(SearchCriteria cri) throws Exception;
}
