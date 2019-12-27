package com.example.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.domain.MemberVO;
import com.example.persistence.MemberDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DBTest {
	@Inject
	MemberDAO dao;
	
	@Test
	public void signin() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setMid("user00");
		vo.setMpassword("pass");
		vo.setMname("David");
		vo.setMgender("male");
		dao.signIn(vo);
	}
	
	@Test
	public void list()throws Exception{
		dao.list();
	}
}
