package com.example.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.ReviewVO;
import com.example.persistence.ReviewDAO;

@Service
public class ReviewServiceImpl implements ReviewService{
	@Inject
	ReviewDAO dao;
	
	@Transactional
	@Override
	public void insert(ReviewVO vo) throws Exception{
		// TODO Auto-generated method stub
		dao.insert(vo);
		dao.update(vo.getH_hcode(),vo.getRevgrade());
	}

	
	
}
