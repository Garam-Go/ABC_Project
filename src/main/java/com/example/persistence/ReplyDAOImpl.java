package com.example.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.Criteria;
import com.example.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO{
	@Inject
	SqlSession session;
	String namespace="ReplyMapper";
	
	@Override
	public List<ReplyVO> list(Criteria cri, int boardid) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("boardid", boardid);
		map.put("cri", cri);
		return session.selectList(namespace + ".list", map);
	}
	@Override
	public int total(int boardid) throws Exception {
		return session.selectOne(namespace + ".total", boardid);
	}
	@Override
	public void insert(ReplyVO vo) throws Exception {
		session.insert(namespace + ".insert", vo);
	}
	@Override
	public void delete(int replyid) throws Exception {
		session.delete(namespace + ".delete", replyid);
	}
}
