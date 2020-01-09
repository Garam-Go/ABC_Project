package com.example.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.GradeVO;
import com.example.domain.ReviewVO;
import com.example.persistence.ReviewDAO;

@Service
public class ReviewServiceImpl implements ReviewService{
 @Inject
 ReviewDAO dao;
 
 

 
}
