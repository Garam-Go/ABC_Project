package com.example.persistence;

import java.util.List;

import com.example.domain.HosVO;
import com.example.domain.SearchCriteria;

public interface HosDAO {
	public List<HosVO> list(String type, String hcode,SearchCriteria cri) throws Exception;
	public int total(String type, String hcode,SearchCriteria cri) throws Exception;
	
	public HosVO hread(int hid,String hcode) throws Exception;
	public void insert(HosVO vo) throws Exception;
}
