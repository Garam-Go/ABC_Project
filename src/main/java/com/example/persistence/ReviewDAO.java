package com.example.persistence;


import java.util.List;

import com.example.domain.ReviewVO;
import com.example.domain.SearchCriteria;

public interface ReviewDAO {
	public List<ReviewVO> list (String hrevmyid,SearchCriteria cri)throws Exception;
	public void insert(ReviewVO vo)throws Exception;
	public void update(String h_hcode,int grade)throws Exception;
	public int total(String hrevmyid);
	public List<ReviewVO> rlist (String h_code)throws Exception;
}
