package com.example.persistence;

import com.example.domain.MemberVO;

public interface MemberDAO {
	public void signIn(MemberVO vo)throws Exception;
	public void list() throws Exception;
}
