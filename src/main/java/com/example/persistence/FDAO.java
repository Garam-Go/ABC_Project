package com.example.persistence;

import java.util.List;

import com.example.domain.FVO;

public interface FDAO {
	public List<FVO> clist() throws Exception;
}
