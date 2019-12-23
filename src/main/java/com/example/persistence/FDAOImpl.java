package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.FVO;

@Repository
public class FDAOImpl implements FDAO{

	@Inject
	SqlSession session;
	
	String namespace="communityMapper";

	@Override
	public List<FVO> clist() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".clist");
	}
	
	
}
