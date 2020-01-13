package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.HsearchVO;
import com.example.domain.SearchCriteria;

@Repository
public class HsearchDAOImpl implements HsearchDAO{

	@Inject
	SqlSession session;
	
	String namespace="HsearchMapper";
	
	@Override
	public List<HsearchVO> hlist(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".hlist",cri);
	}

	@Override
	public int htotal(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".htotal",cri);
	}

}
