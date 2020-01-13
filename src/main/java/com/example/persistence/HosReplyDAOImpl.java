package com.example.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.HosReplyVO;
import com.example.domain.ReplyVO;

@Repository
public class HosReplyDAOImpl implements HosReplyDAO{

	@Inject
	SqlSession session;
	
	String namespace="HosReplyMapper";

	@Override
	public List<ReplyVO> hlist(int pid, String hcode) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pid", pid);
		map.put("hcode", hcode);
		return session.selectList(namespace+".hlist",map);
	}

	@Override
	public void Hinsert(HosReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".Hinsert",vo);
	}

}
