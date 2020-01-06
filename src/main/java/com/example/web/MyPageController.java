package com.example.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.persistence.MemberDAO;

@Controller
public class MyPageController {
	@Inject
	MemberDAO mdao;
	
	//마이페이지 이동 (프로필용 사용자 정보 가져감)
	@RequestMapping("MyPage")
	public String Basket(Model model, String mid) throws Exception{
		model.addAttribute("my",mdao.login(mid));
		return "/Member/MyPage";
	}
	
	//병원 보관함 이동
	@RequestMapping("BasketHosMove")
	public String Baskethos(){
		return "/Member/BasketHos";
	}
	
	//최근 본 병원
	@RequestMapping("BasketHosList")
	public String Basketlist(){
		return "/Member/BasketHosList";
	}
	//병원예약
	@RequestMapping("BasketHosRes")
	public String Baskethosres(){
		return "/Member/BasketHosRes";
	}
	//병원 리뷰
	@RequestMapping("BasketHosRev")
	public String Basketrev(){
		return "/Member/BasketHosRev";
	}
	//약 보관함 이동
	@RequestMapping("BasketMedMove")
	public String Basketmed(){
		return "/Member/BasketMed";
	}
	//최근 검색 약
	@RequestMapping("BasketMedList")
	public String Basketmedlist(){
		return "/Member/BasketMedList";
	}
	//관심있는 약
	@RequestMapping("BasketMedFav")
	public String Basketmedfav(){
		return "/Member/BasketMedFav";
	}
	//댓글 리스트(커뮤니티 페이지하고 연동)
	@RequestMapping("BasketRepList")
	public String Basketreplist(){
		return "/Member/BasketRepList";
	}
	//커뮤 보관함
	@RequestMapping("BasketComMove")
	public String Basketcom(){
		return "/Member/BasketCom";
	}
	//자유게시판 글
	@RequestMapping("BasketComFree")
	public String Basketcomfree(){
		return "/Member/BasketComFree";
	}
	//질문글
	@RequestMapping("BasketComQes")
	public String Basketcomqes(){
		return "/Member/BasketComQes";
	}
	//메세지함 이동
	@RequestMapping("MessageHome")
	public String Messagehome(){
		return "/Member/Message/MessageHome";
	}
	
	//메세지 보내기
	@RequestMapping("Message")
	public String Message(){
		return "/Member/Message/Message";
	}
	
	
	//휴지통 이동
		@RequestMapping("MessageDel")
		public String messageDel(){
			return "/Member/Message/MessageDel";
		}
	//고객센터 이동
	@RequestMapping("CSqna")
	public String CSqna(){
		return "/Member/CS/CSqna";
	}

	//1:1질문 이동
	@RequestMapping("CSqes")
	public String CSqes(){
		return "/Member/CS/CSqes";
	}
}
