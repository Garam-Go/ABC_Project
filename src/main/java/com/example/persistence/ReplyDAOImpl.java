package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.ReplyVO;
@Repository
public class ReplyDAOImpl implements ReplyDAO{

	@Inject
	SqlSession session;
	
	String namespace="ReplyMapper";
	
	@Override
	public List<ReplyVO> list(int pid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".list",pid);
	}

	@Override
	public void Finsert(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".Finsert",vo);
	}

	@Override
	public void Qinsert(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".Qinsert",vo);
	}

	@Override
	public List<ReplyVO> qlist(int pid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".qlist",pid);
	}
	
}
