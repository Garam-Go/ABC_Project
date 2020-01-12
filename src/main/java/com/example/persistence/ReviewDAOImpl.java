package com.example.persistence;


import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.ReviewVO;

@Repository
public class ReviewDAOImpl implements ReviewDAO{
	
	@Inject
	SqlSession session;
	String namespace="ReviewMapper";
	
	@Override
	public void reviewinsert(ReviewVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".insert",vo);
	}

	@Override
	public void reviewupdate(String h_hcode,int revgrade) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("h_hcode", h_hcode);
		map.put("revgrade", revgrade);
		session.update(namespace+".update",map);
	}


	
	
	
}
