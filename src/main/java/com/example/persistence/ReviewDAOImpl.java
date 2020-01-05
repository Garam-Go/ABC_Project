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
private String namespace="ReivewMapper";
@Override
public void insert(ReviewVO vo) throws Exception {
	// TODO Auto-generated method stub
	session.insert(namespace+".insert",vo);
}
@Override
public void update(String h_hcode,int grade) throws Exception {
	// TODO Auto-generated method stub
	HashMap<String,Object> map=new HashMap<String,Object>();
	map.put("h_hcode", h_hcode);
	map.put("grade", grade);
	session.update(namespace+".update",map);
}


}
