package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HReadController {
	//소아과 1개
	@ResponseBody
	@RequestMapping("r1.json")
	public ArrayList r1() throws Exception{
		
		ArrayList array=new ArrayList();
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		//

		Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%86%8C%EC%95%84%EA%B3%BC").get();
		
		Elements es=doc.select(".list_area .list_place_col1");
		
		
		
		Elements e=es.select("#_business_13241063");
			
			map.put("title", e.select(".name").text());
			map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
			map.put("time",e.select(".time").text());
	
		
		//
		
		Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241063&query=%EC%97%B0%EC%84%B8%EA%BE%B8%EB%9F%AC%EA%B8%B0%EC%86%8C%EC%95%84%EC%B2%AD%EC%86%8C%EB%85%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
		
		Elements es2=doc2.select(".bizinfo_area");
		
		Elements e2=es2.select(".list_bizinfo");
			
			map.put("phone", e2.select(".list_item_biztel .txt").text());
			map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
			map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
		
		
		
		
		Elements el=doc2.select(".tab_detail_area");
		
		Elements e3=el.select(".hospital_info");
			
			map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
		
		
		
			
		array.add(map);	
		return array;
		
		
	}
	//소아과 2개
		@ResponseBody
		@RequestMapping("r2.json")
		public ArrayList r2() throws Exception{
			
			ArrayList array=new ArrayList();
			
			HashMap<String,Object> map=new HashMap<String,Object>();
			//

			Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%86%8C%EC%95%84%EA%B3%BC").get();
			
			Elements es=doc.select(".list_area .list_place_col1");
			
			
			
			Elements e=es.select("#_business_33680041");
				
				map.put("title", e.select(".name").text());
				map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
				map.put("time",e.select(".time").text());
		
			
			//
			
			Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=33680041&query=%EA%BC%AC%EA%BC%AC%EB%A7%88%EC%86%8C%EC%95%84%EC%B2%AD%EC%86%8C%EB%85%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
			
			Elements es2=doc2.select(".bizinfo_area");
			
			Elements e2=es2.select(".list_bizinfo");
				
				map.put("phone", e2.select(".list_item_biztel .txt").text());
				map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
				map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
			
			
			
			
			Elements el=doc2.select(".tab_detail_area");
			
			Elements e3=el.select(".hospital_info");
				
				map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
			
			
			
				
			array.add(map);	
			return array;
			
			
		}
		//소아과 3개
				@ResponseBody
				@RequestMapping("r3.json")
				public ArrayList r3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%86%8C%EC%95%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_12867153");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12867153&query=%EC%A4%80%EC%86%8C%EC%95%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//소아과 4개
				@ResponseBody
				@RequestMapping("r4.json")
				public ArrayList r4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%86%8C%EC%95%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_213799379");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=213799379&query=%EC%B4%88%EB%A1%9D%EC%86%8C%EC%95%84%EC%B2%AD%EC%86%8C%EB%85%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//소아과 5개
				@ResponseBody
				@RequestMapping("r5.json")
				public ArrayList r5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%86%8C%EC%95%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_11842616");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11842616&query=%ED%98%84%EB%8C%80%EC%84%B1%EB%AA%A8%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//소아과 6개
				@ResponseBody
				@RequestMapping("r6.json")
				public ArrayList r6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%86%8C%EC%95%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_1265073798");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1265073798&query=%EB%B8%8C%EC%9D%B4%EC%95%84%EC%9D%B4%EC%94%A8%EC%86%8C%EC%95%84%EC%B2%AD%EC%86%8C%EB%85%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//이비인후과 1개
				@ResponseBody
				@RequestMapping("s1.json")
				public ArrayList s1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13418774");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13418774&query=%EC%A0%95%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//이비인후과 2개
				@ResponseBody
				@RequestMapping("s2.json")
				public ArrayList s2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241129");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241129&query=%EC%BD%94%EC%BD%94%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//이비인후과 3개
				@ResponseBody
				@RequestMapping("s3.json")
				public ArrayList s3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241429");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241429&query=%EB%B0%95%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//이비인후과 4개
				@ResponseBody
				@RequestMapping("s4.json")
				public ArrayList s4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_21705802");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=21705802&query=%EB%8B%A4%EC%9D%B8%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC%EB%B3%91%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//이비인후과 5개
				@ResponseBody
				@RequestMapping("s5.json")
				public ArrayList s5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241031");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241031&query=%EC%97%B0%EC%84%B8%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//이비인후과 6개
				@ResponseBody
				@RequestMapping("s6.json")
				public ArrayList s6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_21581926");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=21581926&query=%EC%BD%94%EC%95%84%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//내과 1개
				@ResponseBody
				@RequestMapping("t1.json")
				public ArrayList t1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%82%B4%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241249");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241249&query=%EA%B9%80%EC%B2%A0%EB%82%B4%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//내과 2개
				@ResponseBody
				@RequestMapping("t2.json")
				public ArrayList t2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%82%B4%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_1113470842");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1113470842&query=%EC%A3%BC%ED%98%9C%EC%98%81%EB%82%B4%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//내과 3개
				@ResponseBody
				@RequestMapping("t3.json")
				public ArrayList t3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%82%B4%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241029");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241029&query=%EB%A7%88%EC%9D%8C%EC%86%8D%EB%82%B4%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//내과 4개
				@ResponseBody
				@RequestMapping("t4.json")
				public ArrayList t4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%82%B4%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241028");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241028&query=%EB%B6%80%EB%B6%80%EB%82%B4%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//내과 5개
				@ResponseBody
				@RequestMapping("t5.json")
				public ArrayList t5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%82%B4%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_10968780");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=10968780&query=%EC%86%8D%ED%8E%B8%ED%95%9C%EB%82%B4%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//내과 6개
				@ResponseBody
				@RequestMapping("t6.json")
				public ArrayList t6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%82%B4%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241140");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241140&query=%ED%95%9C%EC%82%AC%EB%9E%91%EB%82%B4%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				
				//피부과 1개
				@ResponseBody
				@RequestMapping("u1.json")
				public ArrayList u1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%94%BC%EB%B6%80%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_21575952");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=21575952&query=%EC%98%A4%EB%9D%BC%ED%81%B4%ED%94%BC%EB%B6%80%EA%B3%BC%EC%9D%98%EC%9B%90%20%EA%B5%AC%EC%9B%94%EC%A0%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//피부과 2개
				@ResponseBody
				@RequestMapping("u2.json")
				public ArrayList u2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%94%BC%EB%B6%80%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_35168885");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=35168885&query=%EC%88%98%ED%94%BC%EB%B6%80%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//피부과 3개
				@ResponseBody
				@RequestMapping("u3.json")
				public ArrayList u3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%94%BC%EB%B6%80%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_38548177");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=38548177&query=%EC%98%A4%EC%B2%B4%EC%95%88%ED%94%BC%EB%B6%80%EA%B3%BC%EC%9D%98%EC%9B%90%20%EB%B6%80%EC%B2%9C").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//피부과 4개
				@ResponseBody
				@RequestMapping("u4.json")
				public ArrayList u4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%94%BC%EB%B6%80%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_36650530");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=36650530&query=%ED%9C%B4%EB%A8%BC%ED%94%BC%EB%B6%80%EA%B3%BC%EC%9D%98%EC%9B%90%20%EC%86%A1%EB%8F%84%EC%A0%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//피부과 5개
				@ResponseBody
				@RequestMapping("u5.json")
				public ArrayList u5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%94%BC%EB%B6%80%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_19594160");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=19594160&query=%EB%8D%94%ED%94%BC%EB%B6%80%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//피부과 6개
				@ResponseBody
				@RequestMapping("u6.json")
				public ArrayList u6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%94%BC%EB%B6%80%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_11874651");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11874651&query=%ED%81%B4%EB%A6%B0%EC%97%85%ED%94%BC%EB%B6%80%EA%B3%BC%EC%9D%98%EC%9B%90%20%EC%9D%BC%EC%82%B0%EC%A0%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//정형외과 1개
				@ResponseBody
				@RequestMapping("x1.json")
				public ArrayList x1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_11721020");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11721020&query=%ED%95%99%EC%9D%B5%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//정형외과 2개
				@ResponseBody
				@RequestMapping("x2.json")
				public ArrayList x2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_1941352892");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1941352892&query=%EB%B0%95%EB%AA%85%EC%A3%BC%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}				//정형외과 3개
				@ResponseBody
				@RequestMapping("x3.json")
				public ArrayList x3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241064");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241064&query=%EC%9D%B8%ED%95%98%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}				//정형외과 4개
				@ResponseBody
				@RequestMapping("x4.json")
				public ArrayList x4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241179");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241179&query=%EA%B8%B0%EC%81%A8%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}				//정형외과 5개
				@ResponseBody
				@RequestMapping("x5.json")
				public ArrayList x5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_381117000");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=381117000&query=%ED%81%B0%EB%B0%94%EC%9C%84%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}				
				//정형외과 6개
				@ResponseBody
				@RequestMapping("x6.json")
				public ArrayList x6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241074");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241074&query=%EC%97%B0%EC%84%B8%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select(".tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(3) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}	
				//안과 1개
				@ResponseBody
				@RequestMapping("y1.json")
				public ArrayList y1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%95%88%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_20183149");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=20183149&query=%EC%9A%B0%EC%84%B1%EC%95%88%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}	
				//안과 2개
				@ResponseBody
				@RequestMapping("y2.json")
				public ArrayList y2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%95%88%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_11528388");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11528388&query=%ED%91%B8%EB%A5%B8%EC%84%B8%EC%83%81%EC%95%88%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//안과 3개
				@ResponseBody
				@RequestMapping("y3.json")
				public ArrayList y3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%95%88%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_12902083");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12902083&query=%EB%B0%9D%EC%9D%80%EC%84%B1%EB%AA%A8%EC%95%88%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//안과 4개
				@ResponseBody
				@RequestMapping("y4.json")
				public ArrayList y4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%95%88%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_11523134");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11523134&query=%EA%B9%80%EC%95%88%EA%B3%BC%EB%B3%91%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//안과 5개
				@ResponseBody
				@RequestMapping("y5.json")
				public ArrayList y5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%95%88%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_11878362");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11878362&query=%EB%8A%98%EB%B0%9D%EC%9D%80%EC%95%88%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//안과 6개
				@ResponseBody
				@RequestMapping("y6.json")
				public ArrayList y6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%95%88%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_31059127");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=31059127&query=%EC%84%9C%EC%9A%B8%EB%B0%9D%EC%9D%80%EC%95%88%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//치과 1개
				@ResponseBody
				@RequestMapping("z1.json")
				public ArrayList z1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241161");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241161&query=%EC%A7%80%EB%94%94%EC%8A%A4%EC%B9%98%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//치과 2개
				@ResponseBody
				@RequestMapping("z2.json")
				public ArrayList z2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_19877981");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=19877981&query=%EB%A7%91%EC%9D%80%ED%96%A5%EA%B8%B0%EC%B9%98%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//치과 3개
				@ResponseBody
				@RequestMapping("z3.json")
				public ArrayList z3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241124");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241124&query=%ED%95%99%EC%9D%B5%EA%B5%BF%EB%AA%A8%EB%8B%9D%EC%B9%98%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//치과 4개
				@ResponseBody
				@RequestMapping("z4.json")
				public ArrayList z4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_19866858");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=19877981&query=%EB%A7%91%EC%9D%80%ED%96%A5%EA%B8%B0%EC%B9%98%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//치과 5개
				@ResponseBody
				@RequestMapping("z5.json")
				public ArrayList z5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_1220418756");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1220418756&query=%EC%9D%B8%EC%B2%9C%EB%AF%B8%EC%B9%98%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//치과 6개
				@ResponseBody
				@RequestMapping("z6.json")
				public ArrayList z6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_1173132115");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1173132115&query=%EC%97%B0%EC%84%B8%EB%B0%98%ED%8A%B8%EC%B9%98%EA%B3%BC%EA%B5%90%EC%A0%95%EA%B3%BC%EC%B9%98%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//한의원 1개
				@ResponseBody
				@RequestMapping("a1.json")
				public ArrayList a1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241180");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241180&query=%EC%84%9D%EC%9E%AC%ED%99%8D%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//한의원 2개
				@ResponseBody
				@RequestMapping("a2.json")
				public ArrayList a2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241270");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241270&query=%EA%B0%90%EC%B4%88%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//한의원 3개
				@ResponseBody
				@RequestMapping("a3.json")
				public ArrayList a3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_36912443");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=36912443&query=%EB%8B%A4%EB%82%9C%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				
				
				/*여기부터 다시~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
				//한의원 4개
				@ResponseBody
				@RequestMapping("a4.json")
				public ArrayList a4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13123195");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13123195&query=%ED%95%99%EC%9D%B5%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//한의원 5개
				@ResponseBody
				@RequestMapping("a5.json")
				public ArrayList a5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					//

					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					
					
					Elements e=es.select("#_business_13241284");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241284&query=%EC%9E%90%EC%9D%B8%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//한의원 6개
				@ResponseBody
				@RequestMapping("a6.json")
				public ArrayList a6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%B9%98%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_11676488");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11676488&query=%EA%B1%B0%EB%B6%81%EC%9D%B4%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
					Elements es2=doc2.select(".bizinfo_area");
					
					Elements e2=es2.select(".list_bizinfo");
						
						map.put("phone", e2.select(".list_item_biztel .txt").text());
						map.put("addressA", e2.select(".list_item_address .list_address li:nth-child(1)").text());//도로명 주소
						map.put("addressB", e2.select(".list_item_address .list_address li:nth-child(2) .addr").text());//지번 주소
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
	
	
	
	
	
	
	
}
