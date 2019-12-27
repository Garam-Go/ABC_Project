package com.example.persistence;

import java.util.List;

import com.example.domain.MemberVO;

public interface MemberDAO {
	public void signIn(MemberVO vo)throws Exception;
	public List<MemberVO> list() throws Exception;
	
	//로그인을 하기위해 비밀번호를 꺼내오는 매소드
	public MemberVO login(String mid)throws Exception;
}
