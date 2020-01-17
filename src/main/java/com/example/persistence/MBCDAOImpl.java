package com.example.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.FVO;
import com.example.domain.ReplyVO;

@Repository
public class MBCDAOImpl implements MBCDAO{
	@Inject
	SqlSession session;
	String namespace="MBCMapper";
	@Override
	public List<FVO> flist(String fname) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".flist",fname);
	}
	@Override
	public List<ReplyVO> replist(String mid) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".replist",mid);
	}
	
	
}
