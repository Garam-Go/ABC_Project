package com.example.persistence;

import java.util.List;

import com.example.domain.MedicineVO;
import com.example.domain.SearchCriteria;

public interface MedicineDAO {
	public List<MedicineVO> list(SearchCriteria cri) throws Exception;
	
	public void insert(MedicineVO vo) throws Exception; 
}
