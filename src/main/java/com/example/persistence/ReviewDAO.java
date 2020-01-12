package com.example.persistence;

import com.example.domain.ReviewVO;

public interface ReviewDAO {
	public void reviewinsert(ReviewVO vo) throws Exception;
	public void reviewupdate(String h_hcode,int revgrade) throws Exception;
}
