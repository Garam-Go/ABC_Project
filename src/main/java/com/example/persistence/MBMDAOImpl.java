package com.example.persistence;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.MBasketMVO;
import com.example.domain.MedicineVO;
import com.example.domain.ReplyVO;
import com.example.domain.SearchCriteria;

@Repository
public class MBMDAOImpl implements MBMDAO{
	
	@Inject
	SqlSession session;
	
	private String namespace="MBMMapper";

	@Override
	public List<MBasketMVO> mmlist(String mmid, SearchCriteria cri) throws Exception {
		HashMap<String, Object> hash = new HashMap<String, Object>();
		hash.put("mmid", mmid);
		hash.put("cri", cri);
		return session.selectList(namespace+".mbmlist",hash);
	}

	@Override
	public void mminsert(MBasketMVO vo) throws Exception {
		session.insert(namespace+".mbminsert",vo);
	}

	@Override
	public int mmtotal(String mmid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".mbmtotal",mmid);
	}

	@Override
	public MedicineVO mmread(int mmrecent) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".mread",mmrecent);
	}

	@Override
	public List<ReplyVO> replist(String replyname) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".replist",replyname);
	}

}
