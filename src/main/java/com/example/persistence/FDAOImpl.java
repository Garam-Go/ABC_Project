package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.FVO;
import com.example.domain.SearchCriteria;

@Repository
public class FDAOImpl implements FDAO{

	@Inject
	SqlSession session;
	
	String namespace="freeMapper";

	@Override
	public List<FVO> clist(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".clist", cri);
	}

	@Override
	public int ctotal(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".ctotal", cri);
	}

	@Override
	public FVO cread(int pid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".cread",pid);
	}
	
	@Override
	public void insert(FVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".insert",vo);
	}
}
