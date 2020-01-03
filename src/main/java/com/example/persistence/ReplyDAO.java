package com.example.persistence;

import java.util.List;

import com.example.domain.ReplyVO;

public interface ReplyDAO {
	public List<ReplyVO> list(int pid) throws Exception;
	public void insert(ReplyVO vo) throws Exception;
}
