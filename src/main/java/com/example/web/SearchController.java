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
	//���̹� �Ȱ�
	@ResponseBody
	@RequestMapping("q1.json")
	public ArrayList q1() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EB%82%B4%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}	
	//���̹� �Ǻΰ� 
	@ResponseBody
	@RequestMapping("q2.json")
	public ArrayList q2() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%94%BC%EB%B6%80%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}	
	//�Ȱ�
	@ResponseBody
	@RequestMapping("q3.json")
	public ArrayList q3() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%95%88%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//ġ��
	@ResponseBody
	@RequestMapping("q4.json")
	public ArrayList q4() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//���ǿ�
	@ResponseBody
	@RequestMapping("q5.json")
	public ArrayList q5() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%ED%95%9C%EC%9D%98%EC%9B%90").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//�񴢱��
	@ResponseBody
	@RequestMapping("q6.json")
	public ArrayList q6() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//�������а�
	@ResponseBody
	@RequestMapping("q7.json")
	public ArrayList q7() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%EC%8B%A0%EC%9D%98%ED%95%99%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//�������а�
	@ResponseBody
	@RequestMapping("q8.json")
	public ArrayList q8() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//�ܰ�
	@ResponseBody
	@RequestMapping("q9.json")
	public ArrayList q9() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%99%B8%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//�Ű�ܰ�
	@ResponseBody
	@RequestMapping("q10.json")
	public ArrayList q10() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//����������
	@ResponseBody
	@RequestMapping("q11.json")
	public ArrayList q11() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	//�Ű��
	@ResponseBody
	@RequestMapping("q12.json")
	public ArrayList q12() throws Exception{
		
		ArrayList array=new ArrayList();
		
		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EA%B3%BC").get();
		
		
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		for(Element e:es.select("li")){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			array.add(map);
			
		}
		System.out.println(array);
		return array;
		
		
	}
	
}




