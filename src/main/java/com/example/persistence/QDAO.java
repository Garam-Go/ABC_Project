package com.example.persistence;

import java.util.List;

import com.example.domain.QVO;
import com.example.domain.SearchCriteria;

public interface QDAO {
	public List<QVO> qlist(SearchCriteria cri) throws Exception;
	public int qtotal(SearchCriteria cri) throws Exception;
	public QVO qread(int qid) throws Exception;
	public void insert(QVO vo) throws Exception;
}
