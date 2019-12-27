package com.example.persistence;

import java.util.List;

import com.example.domain.HealVO;
import com.example.domain.SearchCriteria;

public interface HealDAO {
	public List<HealVO> hlist(SearchCriteria cri) throws Exception;
	public void hinsert(HealVO vo) throws Exception;
}
