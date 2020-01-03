package com.example.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.BookVO;
import com.example.domain.MessageVO;
import com.example.domain.SearchCriteria;

@Repository
public class MessageDAOImpl implements MessageDAO{
	@Inject
	SqlSession session;
	
	private String namespace="MessageMapper";
	
	@Override
	public List<MessageVO> list(String mid, SearchCriteria cri) {
		HashMap<String , Object> hash = new HashMap<String, Object>();
		hash.put("mid", mid);
		hash.put("cri", cri);
		return session.selectList(namespace+".mslist",hash);
	}

	@Override
	public void insert(MessageVO vo) {
		// TODO Auto-generated method stub
		session.insert(namespace+".msend",vo);
	}

	@Override
	public void updateDel(MessageVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MessageVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int total(String mid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".total",mid);
	}

	@Override
	public MessageVO read(String msid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".read",msid);
	}

	@Override
	public List<BookVO> booklist(String mbmyid, SearchCriteria cri) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".booklist",mbmyid);
	}

	@Override
	public int btotal(String mbmyid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".btotal",mbmyid);
	}

}
