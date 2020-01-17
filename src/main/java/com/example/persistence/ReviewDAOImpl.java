package com.example.persistence;


import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.ReviewVO;
import com.example.domain.SearchCriteria;

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
@Override
public List<ReviewVO> list(String hrevmyid,SearchCriteria cri) throws Exception {
	HashMap<String, Object> hash = new HashMap<String, Object>();
	hash.put("hrevmyid", hrevmyid);
	hash.put("cri", cri);
	// TODO Auto-generated method stub
	return session.selectList(namespace+".revlist",hash);
}
@Override
public int total(String hrevmyid) {
	// TODO Auto-generated method stub
	return session.selectOne(namespace+".revtotal",hrevmyid);
}
@Override
public List<ReviewVO> rlist( String h_code) throws Exception {
	// TODO Auto-generated method stub

	return session.selectList(namespace+".rlist",h_code);
}


}
