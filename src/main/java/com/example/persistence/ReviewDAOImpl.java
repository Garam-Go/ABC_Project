package com.example.persistence;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.ReviewVO;

@Repository
public class ReviewDAOImpl implements ReviewDAO{
	
	@Inject
	SqlSession session;
	String namespace="ReviewMapper";


	
	
	
}
