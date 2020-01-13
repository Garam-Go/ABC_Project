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
	public List<ReplyVO> list(Criteria cri, int medcode) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("medcode", medcode);
		map.put("cri", cri);
		return session.selectList(namespace + ".list", map);
	}
	
	@Override
	public void insert(ReplyVO vo) throws Exception {
		session.insert(namespace + ".insert", vo);
	}
	
	@Override
	public void delete(int replyid, int medcode) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("replyid", replyid);
		map.put("medcode", medcode);
		session.selectList(namespace + ".delete", map);
	}
	
	@Override
	public int total(int medcode) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".total",medcode);
	}

	@Override
	public List<ReplyVO> clist(int pid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".clist",pid);
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

	@Override
	public List<ReplyVO> mmlist(Criteria cri, String replyname) {
		// TODO Auto-generated method stub
		HashMap<String, Object> hash = new HashMap<String, Object>();
		hash.put("cri", cri);
		hash.put("replyname", replyname);
		return session.selectList(namespace+".mmlist",hash);
	}

	@Override
	public int mmtotal(String replyname) {
		// TODO Auto-generated method stub
		HashMap<String, Object> hash = new HashMap<String, Object>();
		hash.put("replyname", replyname);
		return session.selectOne(namespace+".mmtotal",replyname);
	}
	
}
