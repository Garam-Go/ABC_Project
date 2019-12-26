package com.example.persistence;

import java.util.List;

import com.example.domain.MemberVO;

public interface MemberDAO {
	public void signIn(MemberVO vo)throws Exception;
	public List<MemberVO> list() throws Exception;
	
	//�α����� �ϱ����� ��й�ȣ�� �������� �żҵ�
	public MemberVO login(String mid)throws Exception;
}
