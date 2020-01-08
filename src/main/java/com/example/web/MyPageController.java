package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.HVO;
import com.example.domain.MBasketHVO;
import com.example.domain.PageMaker;
import com.example.domain.SearchCriteria;
import com.example.persistence.HDAO;
import com.example.persistence.MBHDAO;
import com.example.persistence.MemberDAO;

@Controller
public class MyPageController {
	@Inject
	MemberDAO mdao;
	@Inject
	MBHDAO mbhdao;
	
	//���������� �̵� (�����ʿ� ����� ���� ������)
	@RequestMapping("MyPage")
	public String Basket(Model model, String mid) throws Exception{
		model.addAttribute("my",mdao.login(mid));
		return "/Member/MyPage";
	}
	
	//���� ������ �̵�
	@RequestMapping("BasketHosMove")
	public String Baskethos(){
		return "/Member/BasketHos";
	}
	
	//�ֱ� �� ����
	@RequestMapping("BasketHosList")
	public String Basketlist(){
		return "/Member/BasketHosList";
	}
	
	//�ֱ� �� ������ ������
	@ResponseBody
	@RequestMapping("BasketHosSaveList")
	public HashMap<String, Object> mbhlist(String mid,SearchCriteria cri)throws Exception{
		HashMap<String, Object> hash = new HashMap<String, Object>();
		cri.setPerPageNum(10); //�� �������� ������ ������ ����
		
		PageMaker pm = new PageMaker(); //�������� ���� ������
		pm.setCri(cri);
		
		pm.setTotalCount(mbhdao.total(mid));
		
		List<MBasketHVO> hlist = mbhdao.list(mid, cri);
		
		int i = hlist.size();
		
		//System.out.println(i);
		
		//hcode�� �̿��� �о�� �����͵��� �ݺ��ؼ� array�� �־���
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
	
	//��������
	@RequestMapping("BasketHosRes")
	public String Baskethosres(){
		return "/Member/BasketHosRes";
	}
	//���� ����
	@RequestMapping("BasketHosRev")
	public String Basketrev(){
		return "/Member/BasketHosRev";
	}
	//�� ������ �̵�
	@RequestMapping("BasketMedMove")
	public String Basketmed(){
		return "/Member/BasketMed";
	}
	//�ֱ� �˻� ��
	@RequestMapping("BasketMedList")
	public String Basketmedlist(){
		return "/Member/BasketMedList";
	}
	//�����ִ� ��
	@RequestMapping("BasketMedFav")
	public String Basketmedfav(){
		return "/Member/BasketMedFav";
	}
	//��� ����Ʈ(Ŀ�´�Ƽ �������ϰ� ����)
	@RequestMapping("BasketRepList")
	public String Basketreplist(){
		return "/Member/BasketRepList";
	}
	//Ŀ�� ������
	@RequestMapping("BasketComMove")
	public String Basketcom(){
		return "/Member/BasketCom";
	}
	//�����Խ��� ��
	@RequestMapping("BasketComFree")
	public String Basketcomfree(){
		return "/Member/BasketComFree";
	}
	//������
	@RequestMapping("BasketComQes")
	public String Basketcomqes(){
		return "/Member/BasketComQes";
	}
	//�޼����� �̵�
	@RequestMapping("MessageHome")
	public String Messagehome(){
		return "/Member/Message/MessageHome";
	}
	
	//�޼��� ������
	@RequestMapping("Message")
	public String Message(){
		return "/Member/Message/Message";
	}
	
	
	//������ �̵�
		@RequestMapping("MessageDel")
		public String messageDel(){
			return "/Member/Message/MessageDel";
		}
	//������ �̵�
	@RequestMapping("CSqna")
	public String CSqna(){
		return "/Member/CS/CSqna";
	}

	//1:1���� �̵�
	@RequestMapping("CSqes")
	public String CSqes(){
		return "/Member/CS/CSqes";
	}
}
