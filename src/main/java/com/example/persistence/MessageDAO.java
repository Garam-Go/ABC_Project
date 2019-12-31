package com.example.persistence;

import java.util.List;

import com.example.domain.MessageVO;
import com.example.domain.SearchCriteria;

public interface MessageDAO {
	//메세지 리스트 불러옴
	public List<MessageVO> list(String mid,SearchCriteria cri);
	
	//메세지보내면 테이블에 인서트
	public void insert(MessageVO vo);
	
	//메세지 삭제(휴지통으로 보냄)
	public void updateDel(MessageVO vo);
	
	//메세지 완전 삭제
	public void delete(MessageVO vo);
}
