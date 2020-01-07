package com.example.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.example.domain.MyBasHVO;
import com.example.domain.SearchCriteria;

public class MBHDAOImpl implements MBHDAO{
	@Inject
	SqlSession session;
	
	@Inject
	MBHDAO mbhdao;
	
	private String namespace="MBHMapper";
	
	//병원 저장 리스트 
	@Override
	public List<MyBasHVO> list(String mhid, SearchCriteria cri) throws Exception {
		HashMap<String, Object> hash = new HashMap<String, Object>();
		hash.put("mhid", mhid);
		hash.put("cri", cri);
		
		return session.selectList(namespace+".mbhlist",hash);
	}
	
	//최근 본 병원 입력하기
	@Override
	public void insert(MyBasHVO vo) throws Exception {
		session.insert(namespace+".mbhinsert",vo);
	}

	

}
