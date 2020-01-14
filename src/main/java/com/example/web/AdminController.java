package com.example.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.MemberVO;
import com.example.persistence.MemberDAO;

@Controller
public class AdminController {
	@Inject
	MemberDAO Memdao;
	
	//질문 답변 목록
	@RequestMapping("adminQuestionList")
	public String adminQuestionList(){
		return "/Admin/adminQuestionList";
	}
	
	//질문 답변 리드
	@RequestMapping("adminQuestionAnswer")
	public String adminQuestionAnswer(){
		return "/Admin/adminQuestionAnswer";
	}
	//신고 된 글 목록
	@RequestMapping("adminReport")
	public String adminReport(){
		return "/Admin/adminReport";
	}
	//신고된 회원 목록
	@RequestMapping("NewFile")
	public String NewFile(){
		return "/Admin/NewFile";
	}
	//블랙리스트
	@RequestMapping("NewFile2")
	public String NewFile2(){
		return "/Admin/NewFile2";
	}
	//탈퇴
	@RequestMapping("NewFile3")
	public String NewFile3(){
		return "/Admin/NewFile3";
	}
	//Q&A
	@RequestMapping("qna")
	public String qna(){
		return "/Admin/qna";
	}

	
	//어드민 메인페이지 이동
	@RequestMapping("AdminMain")
	public String main(){
		return "/Admin/AdminMain";
	}
	
	//회원리스트 확인
	@ResponseBody
	@RequestMapping("MemList")
	public List<MemberVO> Memlist() throws Exception{
		List<MemberVO> list = Memdao.list();
		return list;
	}
	
	
}
