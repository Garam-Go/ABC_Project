package com.example.persistence;

import java.util.List;

import com.example.domain.HVO;
import com.example.domain.SearchCriteria;

public interface HDAO {
	public void rinsert(HVO vo) throws Exception;
	
	public void insert(HVO vo) throws Exception;
	
	//���� ���� �� ����
	public void tinsert(HVO vo) throws Exception;
	
	public List<HVO> list() throws Exception; //ũ�Ѹ� ������ hsearch�� ������ ��� ���
	public List<HVO> slist(SearchCriteria cri) throws Exception;//ũ�Ѹ� ������ hsearch�� ������ ��� ��� keyword �˻� ����
	public HVO read(String h_code) throws Exception;
	
	
	public void update(HVO vo)throws Exception; //ũ�Ѹ� �����͸� �����ϴ� ������ 
	
	
	
}
