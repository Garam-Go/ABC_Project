package com.example.persistence;

import java.util.List;

import com.example.domain.FVO;
import com.example.domain.ReplyVO;

public interface MBCDAO {
	public List<FVO> flist(String fname);
	public List<ReplyVO> replist(String mid);
}
