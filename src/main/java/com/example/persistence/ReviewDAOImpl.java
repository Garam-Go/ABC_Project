package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.ReviewVO;
import com.example.domain.SearchCriteria;

@Repository
public class ReviewDAOImpl implements ReviewDAO{
	@Inject
	SqlSession session;
	String namespace="ReviewMapper";
	@Override
	public List<MBasketHVO> list() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".list");
	}
	@Override
	public void reviewinsert(MBasketHVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".reviewinsert",vo);
	}
	
	
	


	}
