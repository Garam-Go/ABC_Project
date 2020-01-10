package com.example.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.HosVO;
import com.example.domain.SearchCriteria;

@Repository
public class HosDAOImpl implements HosDAO{

	@Inject
	SqlSession session;
	
	String namespace="HosMapper";

	@Override
	public List<HosVO> list(String type,String hcode,SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("cri", cri);
		map.put("hcode", hcode);
		map.put("type", type);
		return session.selectList(namespace+".hoslist",map);
	}

	@Override
	public int total(String type,String hcode, SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("cri", cri);
		map.put("hcode", hcode);
		map.put("type", type);
		return session.selectOne(namespace+".hostotal",map);
	}
	

	@Override
	public HosVO hread(int hid,String hcode) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hid", hid);
		map.put("hcode", hcode);
		return session.selectOne(namespace+".hread",map);
	}

	@Override
	public void insert(HosVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".insert",vo);
	}

}
