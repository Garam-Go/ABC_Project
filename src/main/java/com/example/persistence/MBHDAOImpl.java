package com.example.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.SearchCriteria;

@Repository
public class MBHDAOImpl implements MBHDAO{
	@Inject
	SqlSession session;
	
	private String namespace="MBHMapper";
	
	//병원 저장 리스트 
	@Override
	public List<MBasketHVO> list(String mhid, SearchCriteria cri) throws Exception {
		HashMap<String, Object> hash = new HashMap<String, Object>();
		hash.put("mhid", mhid);
		hash.put("cri", cri);
		
		return session.selectList(namespace+".mbhlist",hash);
	}
	
	//최근 본 병원 입력하기
	@Override
	public void insert(MBasketHVO vo) throws Exception {
		session.insert(namespace+".mbhinsert",vo);
	}

	@Override
	public HVO hread(String h_code) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".hread",h_code);
	}

	@Override
	public int total(String mhid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".mbhtotal",mhid);
	}

}
