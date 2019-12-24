package com.example.web;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {

	//네이버 소아과 검색에서 병원 위치 지도 가져오기
			@ResponseBody
			@RequestMapping("daumlocal.json")
			public ArrayList daumlocal() throws Exception{
				
				ArrayList array=new ArrayList();
				
				Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%9D%B4%EB%B9%88%EC%9D%B4%ED%9B%84%EA%B3%BC").get();
				
				
				
				Elements es=doc.select(".list_area .list_place_col1");
				
				
				for(Element e:es.select("li")){
					HashMap<String,Object> map=new HashMap<String,Object>();
					map.put("title", e.select(".name").text());
					map.put("image", e.select("img").attr("src"));
					array.add(map);
					
				}
				System.out.println(array);
				return array;
				
				
			}
	//네이버 소아과 검색에서 병원 이름 가져오기
	@ResponseBody
	@RequestMapping("daum.json")
	public ArrayList daum() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%86%8C%EC%95%84%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//네이버 이빈이후과 검색에서 병원 이름 가져오기
		@ResponseBody
		@RequestMapping("daum2.json")
		public ArrayList daum2() throws Exception{
			
			ArrayList array=new ArrayList();
			
			Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%9D%B4%EB%B9%88%EC%9D%B4%ED%9B%84%EA%B3%BC").get();
			
			
			
			Elements es=doc.select(".list_area .list_place_col1");
			
			
			for(Element e:es.select("li")){
				HashMap<String,Object> map=new HashMap<String,Object>();
				map.put("title", e.select(".name").text());
				array.add(map);
				
			}
			System.out.println(array);
			return array;
			
			
		}
		
		//네이버 성형외과 검색에서 병원 이름 가져오기
		@ResponseBody
		@RequestMapping("daum3.json")
		public ArrayList daum3() throws Exception{
			
			ArrayList array=new ArrayList();
			
			Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC").get();
			
			
			
			Elements es=doc.select(".list_area .list_place_col1");
			
			
			for(Element e:es.select("li")){
				HashMap<String,Object> map=new HashMap<String,Object>();
				map.put("title", e.select(".name").text());
				array.add(map);
				
			}
			System.out.println(array);
			return array;
			
			
		}	//네이버 정형외과 검색에서 병원 이름 가져오기
		@ResponseBody
		@RequestMapping("daum4.json")
		public ArrayList daum4() throws Exception{
			
			ArrayList array=new ArrayList();
			
			Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC").get();
			
			
			
			Elements es=doc.select(".list_area .list_place_col1");
			
			
			for(Element e:es.select("li")){
				HashMap<String,Object> map=new HashMap<String,Object>();
				map.put("title", e.select(".name").text());
				array.add(map);
				
			}
			System.out.println(array);
			return array;
			
			
		}
		//산부인과
		@ResponseBody
		@RequestMapping("daum5.json")
		public ArrayList daum5() throws Exception{
			
			ArrayList array=new ArrayList();
			
			Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC").get();
			
			
			
			Elements es=doc.select(".list_area .list_place_col1");
			
			
			for(Element e:es.select("li")){
				HashMap<String,Object> map=new HashMap<String,Object>();
				map.put("title", e.select(".name").text());
				array.add(map);
				
			}
			System.out.println(array);
			return array;
			
			
		}
		//네이버 여행 셀레늄 데이터 뽑아내기
		@ResponseBody
		@RequestMapping("2.json")
		public ArrayList<HashMap<String,Object>> travel()throws Exception{
			ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();
			
			//셀레늄을 쓰는 경우
			
			//드라이브 설정
			System.setProperty("webdriver.chrome.driver", "c:/spring/chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("headless");
			WebDriver driver=new ChromeDriver(option);
			
			//위치에 맞은 설정
			driver.get("https://store.naver.com/hospitals/list?query=%EC%9D%B8%EC%B2%9C%EA%B4%91%EC%97%AD%EC%8B%9C%EB%AF%B8%EC%B6%94%ED%99%80%EA%B5%AC%ED%95%99%EC%9D%B5%EB%8F%99%20%EB%B3%91%EC%9B%90&queryType=hospital&sessionid=EJgRDFh5xk0LxjhCV6xTnHxg&sortingOrder=precision");
			
			//버튼 찾기
			WebElement btnTheme=driver.findElement(By.id("container")).findElement(By.className("btn_select"));
			
			//버튼 누르기
			btnTheme.click();
			

			WebElement theme = driver.findElement(By.className("list_link"));
			
			
			//theme 찾기
			List<WebElement> themes=theme.findElements(By.className("list_department"));
			
			
			for(WebElement e:themes){
				WebElement item=e.findElement(By.className("list_item"));
				if(item.getAttribute("aria-selected").equals("true")){
					item.click();
					

	//
					WebElement travel=driver.findElement(By.className("list_place_col1"));
					List<WebElement> travels=travel.findElements(By.className("list_item"));
					for(WebElement el:travels){
						WebElement title=el.findElement(By.className("name"));
						HashMap<String,Object> map=new HashMap<String,Object>();
						map.put("title",title.getText());
						list.add(map);
					}
				}
			}
			
			driver.quit();
			return list;
			
		}
	}




