package com.example.persistence;

import java.util.List;

import com.example.domain.FVO;
import com.example.domain.SearchCriteria;

public interface FDAO {
	public List<FVO> clist(SearchCriteria cri) throws Exception;
	public int ctotal(SearchCriteria cri) throws Exception;
	public FVO cread(int pid) throws Exception;
	public void insert(FVO vo) throws Exception;
}
