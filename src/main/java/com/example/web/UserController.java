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
		if(vo.getMid().equals("user00") && vo.getMpassword().equals("pass")){ //로그인 정보가 맞으면
			session.setAttribute("mid", vo.getMid()); //일치한 mid를 httpsession에 저장해서 가져감
			//httpsession = 프로젝트가 종료될때까지 데이터 유지
			
			//만약에 인터셉터에서 받아온 des값이 비어있지 않으면 = 값이 있으면
			if(session.getAttribute("des") != null){
				return "redirect:"+session.getAttribute("des"); //저장되어있는 목적지로 이동함
			}
			//이게 처음 로그인할때는 이 작업을 진행하지 않으니까 바로 리스트 페이지로 가는데
			//글쓰기를 누른다음에 로그인을 하면 des값이 저장되니까 로그인을 하면 그 페이지로 이동하게끔 해주는 작업
		}
		return "redirect:home";
	}

	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("mid");
		return "redirect:home";
	}
	
	//네아로
	@RequestMapping("naverlogin")
	public String naverlogin(){
		return "/Member/naverlogin";
	}
	
	//회원가입
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
        String token = myToken;// 네이버 로그인 접근 토큰;
        String header = "Bearer " + token; // Bearer 다음에 공백 추가
        try {
            String apiURL = "https://openapi.naver.com/v1/nid/me";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", header);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
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
