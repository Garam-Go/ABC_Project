package com.example.persistence;

import java.util.List;

import com.example.domain.HosReplyVO;
import com.example.domain.ReplyVO;

public interface HosReplyDAO {
	public List<ReplyVO> hlist(int pid, String hcode) throws Exception;
	public void Hinsert(HosReplyVO vo) throws Exception;
}
