package com.example.persistence;

import java.util.List;

import com.example.domain.Criteria;
import com.example.domain.ReplyVO;

public interface ReplyDAO {
	public List<ReplyVO> list(Criteria cri,int boardid)throws Exception;
	
	public int total(int boardid) throws Exception;
	
	public void insert(ReplyVO vo)throws Exception;
	
	public void delete(int replyid) throws Exception;
}