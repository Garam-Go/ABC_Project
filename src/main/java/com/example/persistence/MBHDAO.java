package com.example.persistence;

import java.util.List;

import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.SearchCriteria;

public interface MBHDAO {
	//����� ������ ����Ʈ
	public List<MBasketHVO> list(String mhid,SearchCriteria cri) throws Exception;
	//�ֱ� ��� ������ ���� ����
	public void insert(MBasketHVO vo) throws Exception;
	//���� ���� ����
	
	//����� ������ �ڵ带 �̿��� �����ҷ�����
	public HVO hread(String h_code) throws Exception;
}
