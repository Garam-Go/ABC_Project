package com.example.persistence;

import java.util.List;

import com.example.domain.MedicineVO;
import com.example.domain.SearchCriteria;

public interface MedicineDAO {
	public List<MedicineVO> list(SearchCriteria cri) throws Exception;
	
	public void insert(MedicineVO vo) throws Exception;

	public int total() throws Exception; 
	
	public MedicineVO read(int medcode) throws Exception;
	 
	public List<MedicineVO> slist(SearchCriteria cri) throws Exception;
	
	public int stotal(SearchCriteria cri) throws Exception;
}
