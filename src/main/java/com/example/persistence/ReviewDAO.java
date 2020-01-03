package com.example.persistence;

import java.util.List;

import com.example.domain.MBasketHVO;

public interface ReviewDAO {
	public List<MBasketHVO> list()throws Exception;	
	public void reviewinsert(MBasketHVO vo)throws Exception;
}
