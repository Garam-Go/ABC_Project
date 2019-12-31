package com.example.persistence;

import java.util.List;

import com.example.domain.MessageVO;
import com.example.domain.SearchCriteria;

public interface MessageDAO {
	//�޼��� ����Ʈ �ҷ���
	public List<MessageVO> list(String mid,SearchCriteria cri);
	
	//�޼��������� ���̺� �μ�Ʈ
	public void insert(MessageVO vo);
	
	//�޼��� ����(���������� ����)
	public void updateDel(MessageVO vo);
	
	//�޼��� ���� ����
	public void delete(MessageVO vo);
}
