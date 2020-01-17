package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.FVO;
import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.MBasketMVO;
import com.example.domain.MedicineVO;
import com.example.domain.PageMaker;
import com.example.domain.ReplyVO;
import com.example.domain.SearchCriteria;
import com.example.persistence.HDAO;
import com.example.persistence.MBCDAO;
import com.example.persistence.MBHDAO;
import com.example.persistence.MBMDAO;
import com.example.persistence.MemberDAO;

@Controller
public class MyPageController {
	@Inject
	MemberDAO mdao;
	@Inject
	MBHDAO mbhdao;
	@Inject
	MBMDAO mbmdao;
	@Inject
	MBCDAO mbcdao;
	
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
	
	//최근 본 병원의 데이터
	@ResponseBody
	@RequestMapping("BasketHosSaveList")
	public HashMap<String, Object> mbhlist(String mid,SearchCriteria cri)throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();
		cri.setPerPageNum(10); //한 페이지에 보여줄 데이터 갯수
		
		PageMaker pm = new PageMaker(); //페이지에 관한 정보들
		pm.setCri(cri);
		
		pm.setTotalCount(mbhdao.total(mid));
		
		List<MBasketHVO> hlist = mbhdao.list(mid, cri);
		
		int i = hlist.size();
		
		//System.out.println(i);
		
		//hcode를 이용해 읽어온 데이터들을 반복해서 array에 넣어줌
		ArrayList<HVO> array = new ArrayList<HVO>();
		for(int a=0; a<i;a++){
			HVO vo = new HVO();
			vo = mbhdao.hread(hlist.get(a).getMhrecent().toString());
			array.add(vo);
		}
		//System.out.println(array.toString());
		hash.put("hos", array);
		hash.put("list", mbhdao.list(mid, cri));
		hash.put("pm", pm);
		return hash;
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
	
	//최근 본 약의 데이터
	@ResponseBody
	@RequestMapping("BasketMedSaveList")
	public HashMap<String, Object> mbMlist(String mmid,SearchCriteria cri)throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();
		cri.setPerPageNum(10); //한 페이지에 보여줄 데이터 갯수
		
		PageMaker pm = new PageMaker(); //페이지에 관한 정보들
		pm.setCri(cri);
		
		pm.setTotalCount(mbmdao.mmtotal(mmid));
		
		List<MBasketMVO> hlist = mbmdao.mmlist(mmid, cri);
		
		int i = hlist.size();
		
		ArrayList<MedicineVO> array = new ArrayList<MedicineVO>();
		for(int a=0; a<i;a++){
			MedicineVO vo = new MedicineVO();
			vo = mbmdao.mmread(hlist.get(a).getMmrecent());
			array.add(vo);
		}
		hash.put("med", array);
		hash.put("list", mbmdao.mmlist(mmid, cri));
		hash.put("pm", pm);
		return hash;
	}
	
	//관심있는 약
	@RequestMapping("BasketMedFav")
	public String Basketmedfav(){
		return "/Member/BasketMedFav";
	}
	@ResponseBody
	@RequestMapping("mbmreplist")
	public List<ReplyVO> mbmreplist(String replyname){
		return mbmdao.replist(replyname);
	}
	
	//약댓글 리스트
	@RequestMapping("BasketRepListM")
	public String BasketreplistM(){
		return "/Member/BasketRepListM";
	}
	//커뮤댓글 리스트
		@RequestMapping("BasketRepListC")
		public String BasketreplistC(){
			return "/Member/BasketRepListC";
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
	//자게저장글
	@ResponseBody
	@RequestMapping("mbclist")
	public List<FVO> flist(String fname){
		return mbcdao.flist(fname);
	}
	//댓글리스트
	@ResponseBody
	@RequestMapping("mbcreplist")
	public List<ReplyVO> replist(String mid){
		return mbcdao.replist(mid);
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
