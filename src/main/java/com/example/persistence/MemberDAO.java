package com.example.persistence;

import java.util.List;

import com.example.domain.MemberVO;

public interface MemberDAO {
	//회원가입하는 매소드
	public void signIn(MemberVO vo)throws Exception;
	
	//회원정보를 불러오는 리스트
	public List<MemberVO> list() throws Exception;
	
	//로그인을 하기위해 비밀번호를 꺼내오는 매소드
	public MemberVO login(String mid)throws Exception;
	
	//회원의 상태 정보를 업데이트하기
	public void update(String mid,int mstatus) throws Exception;
}
