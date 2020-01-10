package com.example.persistence;

import java.util.List;

import com.example.domain.ReplyVO;

public interface ReplyDAO {
	public List<ReplyVO> list(int pid) throws Exception;
	public void Finsert(ReplyVO vo) throws Exception;
	public List<ReplyVO> qlist(int pid) throws Exception;
	public void Qinsert(ReplyVO vo) throws Exception;
}
