package com.example.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.MedicineVO;
import com.example.domain.SearchCriteria;

@Repository
public class MedicineDAOImpl implements MedicineDAO{
	@Inject
	SqlSession session;
	String namespace="medicineMapper";

	@Override
	public List<MedicineVO> list(SearchCriteria cri) throws Exception {
		return session.selectList(namespace + ".list", cri);
	}

	@Override
	public void insert(MedicineVO vo) throws Exception {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public int total() throws Exception {
		return session.selectOne(namespace + ".total");
	}

	@Override
	public MedicineVO read(int medcode) throws Exception {
		return session.selectOne(namespace + ".read", medcode);
	}

	@Override
	public List<MedicineVO> slist(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".slist",cri);
	}

	@Override
	public int stotal(SearchCriteria cri) throws Exception {
		
		return session.selectOne(namespace+".stotal",cri);
	}
	
}
