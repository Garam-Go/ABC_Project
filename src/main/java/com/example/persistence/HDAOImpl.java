package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.HVO;
import com.example.domain.SearchCriteria;
@Repository
public class HDAOImpl implements HDAO{

	String namespace="healthNewsMapper";
	@Inject
	SqlSession session;
	
	@Override
	public void hinsert(HVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".hinsert",vo);
	}

	@Override
	public List<HVO> hlist(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".hlist",cri);
	}

}