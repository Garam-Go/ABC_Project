package com.example.persistence;

import java.util.List;

import com.example.domain.MBasketHVO;

public interface ReviewDAO {
	public List<MBasketHVO> list()throws Exception;
}
