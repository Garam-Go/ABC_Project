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
