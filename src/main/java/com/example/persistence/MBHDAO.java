package com.example.persistence;

import java.util.List;

import com.example.domain.MyBasHVO;
import com.example.domain.SearchCriteria;

public interface MBHDAO {
	//����� ������ ����Ʈ
	public List<MyBasHVO> list(String mhid,SearchCriteria cri) throws Exception;
	//�ֱ� ��� ������ ���� ����
	public void insert(MyBasHVO vo) throws Exception;
	//���� ���� ����
	
}
