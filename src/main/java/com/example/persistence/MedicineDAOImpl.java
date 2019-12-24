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
	
}
