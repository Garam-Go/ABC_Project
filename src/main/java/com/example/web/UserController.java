package com.example.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.MemberVO;
import com.example.persistence.MemberDAO;

@RequestMapping("Member")
@Controller
public class UserController {
	@Inject
	MemberDAO dao;
	
	@RequestMapping("home")
	public String home(String email, HttpSession session){
		if(email != null){
			session.setAttribute("mid", email);
		}
		return "home";
	}
	
	@RequestMapping("list")
	public String list(String email, HttpSession session){
		if(email != null){
			session.setAttribute("mid", email);
		}
		return "list";
	}
	
	@RequestMapping("insert")
	public String insert(){
		return "insert";
	}
	
	@RequestMapping("login")
	public String login(){
		return "/Member/login";
	}
	
	@RequestMapping(value="loginPost",method=RequestMethod.POST)
	public String loginPost(MemberVO vo, HttpSession session){
		//test id : id = user00 , password = pass
		if(vo.getMid().equals("user00") && vo.getMpassword().equals("pass")){ //�α��� ������ ������
			session.setAttribute("mid", vo.getMid()); //��ġ�� mid�� httpsession�� �����ؼ� ������
			//httpsession = ������Ʈ�� ����ɶ����� ������ ����
			
			//���࿡ ���ͼ��Ϳ��� �޾ƿ� des���� ������� ������ = ���� ������
			if(session.getAttribute("des") != null){
				return "redirect:"+session.getAttribute("des"); //����Ǿ��ִ� �������� �̵���
			}
			//�̰� ó�� �α����Ҷ��� �� �۾��� �������� �����ϱ� �ٷ� ����Ʈ �������� ���µ�
			//�۾��⸦ ���������� �α����� �ϸ� des���� ����Ǵϱ� �α����� �ϸ� �� �������� �̵��ϰԲ� ���ִ� �۾�
		}
		return "redirect:home";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("mid");
		return "redirect:home";
	}
	
	//�׾Ʒ�
	@RequestMapping("naverlogin")
	public String naverlogin(){
		return "/Member/naverlogin";
	}
	
	//ȸ������
	@RequestMapping("signIn")
	public String signIn(){
		return "/Member/signIn";
	}
	 
	@RequestMapping(value="signIn",method=RequestMethod.POST)
	public void signInPost(MemberVO vo,HttpSession session)throws Exception{
		dao.signIn(vo);
		session.setAttribute("mid", vo.getMid());
	}
	
	@RequestMapping("naverLogin")
	public static String naverLogin(String myToken){
        String token = myToken;// ���̹� �α��� ���� ��ū;
        String header = "Bearer " + token; // Bearer ������ ���� �߰�
        try {
            String apiURL = "https://openapi.naver.com/v1/nid/me";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", header);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // ���� �߻�
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
           
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/Member/login";
    }
}
