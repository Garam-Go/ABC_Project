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
public class HDAOImpl implements HDAO{
	@Inject
	SqlSession session;
	String namespace="hMapper";
	
	@Override
	public void insert(HVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".insert",vo);
	}
	@Override
	public List<HVO> list() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".list");
	}
	@Override
	public List<HVO> slist(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".slist",cri);
	}
	@Override
	public HVO read(String h_code) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".read",h_code);
	}
	
	@Override
	public void update(HVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".update",vo);
	}
	@Override
	public void tinsert(HVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".tinsert",vo);
	}
	@Override
	public void reviewinsert(ReviewVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".reviewinsert",vo);
	}

	}
