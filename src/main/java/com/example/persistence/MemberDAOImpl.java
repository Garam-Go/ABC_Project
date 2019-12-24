package com.example.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Inject
	SqlSession session;
	
	private static final String namespace="MemberMapper";
	
	@Override
	public void signIn(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".signIn",vo);
	}

	@Override
	public void list() throws Exception {
		// TODO Auto-generated method stub
		session.selectList(namespace+".list");
	}
	
}
