package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.QVO;
import com.example.domain.SearchCriteria;

@Repository
public class QDAOImpl implements QDAO{
	
	@Inject
	SqlSession session;
	
	String namespace="queryMapper";
	
	@Override
	public List<QVO> qlist(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".qlist", cri);
	}

	@Override
	public int qtotal(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".qtotal", cri);
	}
	
	@Override
	public QVO qread(int qid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".qread",qid);
	}
	
	@Override
	public void insert(QVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".insert",vo);
	}
}
