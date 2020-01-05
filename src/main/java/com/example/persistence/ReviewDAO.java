package com.example.persistence;


import com.example.domain.ReviewVO;

public interface ReviewDAO {
	//public List<ReviewVO> list ()throws Exception;
	public void insert(ReviewVO vo)throws Exception;
	public void update(String h_hcode,int grade)throws Exception;
	
}
