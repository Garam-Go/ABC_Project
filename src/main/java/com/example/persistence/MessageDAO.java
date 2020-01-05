package com.example.persistence;

import java.util.List;

import com.example.domain.BookVO;
import com.example.domain.MessageVO;
import com.example.domain.SearchCriteria;

public interface MessageDAO {
	//메세지 리스트 불러옴
	public List<MessageVO> list(String mid,SearchCriteria cri);
	
	//페이징용 전체 메세지 데이터 수
	public int total(String mid);
	
	//메세지보내면 테이블에 인서트
	public void insert(MessageVO vo);
	
	//메세지 삭제(휴지통으로 보냄)
	public void updateDel(MessageVO vo);
	
	//메세지 완전 삭제
	public void delete(MessageVO vo);
	
	//메세지 읽기
	public MessageVO read(String msid);
	
	//주소록 읽기
	public List<BookVO> booklist(String mbmyid,SearchCriteria cri);
	
	//페이징용 전체주소록 데이터 수
		public int btotal(String mbmyid);
}
