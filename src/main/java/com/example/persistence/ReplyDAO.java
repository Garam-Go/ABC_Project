package com.example.persistence;

import java.util.List;

import com.example.domain.Criteria;
import com.example.domain.ReplyVO;

public interface ReplyDAO {
	public List<ReplyVO> list(Criteria cri,int medcode)throws Exception;
	
	public void insert(ReplyVO vo)throws Exception;
	
	public void delete(int replyid, int medcode) throws Exception;
	
	public int total(int medcode) throws Exception;

	public List<ReplyVO> clist(int pid) throws Exception;
	public void Finsert(ReplyVO vo) throws Exception;
	public List<ReplyVO> qlist(int pid) throws Exception;
	public void Qinsert(ReplyVO vo) throws Exception;
	
	public List<ReplyVO> mmlist(Criteria cri, String replyname);
	public int mmtotal(String replyname);
}
