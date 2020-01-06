package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
			map.put("image",e.select(".list_item_inner .thumb img").attr("src"));//이미지
			

	
		
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
				map.put("image",e.select(".list_item_inner .thumb img").attr("src"));
		
			
			//
			
			Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=33680041&query=%EA%BC%AC%EA%BC%AC%EB%A7%88%EC%86%8C%EC%95%84%EC%B2%AD%EC%86%8C%EB%85%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
			
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
						map.put("image",e.select(".list_item_inner .thumb img").attr("src"));
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12867153&query=%EC%A4%80%EC%86%8C%EC%95%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
						map.put("image",e.select(".list_item_inner .thumb img").attr("src"));	
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=213799379&query=%EC%B4%88%EB%A1%9D%EC%86%8C%EC%95%84%EC%B2%AD%EC%86%8C%EB%85%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
						map.put("image",e.select(".list_item_inner .thumb img").attr("src"));
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11842616&query=%ED%98%84%EB%8C%80%EC%84%B1%EB%AA%A8%EC%9D%98%EC%9B%90").get();
					
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
						map.put("image",e.select(".list_item_inner .thumb img").attr("src"));
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1265073798&query=%EB%B8%8C%EC%9D%B4%EC%95%84%EC%9D%B4%EC%94%A8%EC%86%8C%EC%95%84%EC%B2%AD%EC%86%8C%EB%85%84%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					
					
					
						Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
						
						Elements e3=el.select(".hospital_info");
							
							map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
						
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
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%ED%95%9C%EC%9D%98%EC%9B%90").get();
					
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
				//산부인과 1개
				@ResponseBody
				@RequestMapping("b1.json")
				public ArrayList b1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13059878");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13059878&query=%ED%98%84%EB%8C%80%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//산부인과2개
				@ResponseBody
				@RequestMapping("b2.json")
				public ArrayList b2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_12847708");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12847708&query=%EC%95%A0%ED%94%8C%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC%EA%B0%95%EB%82%A8%EC%A0%90").get();
					
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
				//산부인과 3개
				@ResponseBody
				@RequestMapping("b3.json")
				public ArrayList b3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13101665");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13101665&query=%EB%A1%9C%EC%95%A4%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC%20%EA%B0%95%EB%82%A8%EC%A0%90").get();
					
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
				//산부인과 4개
				@ResponseBody
				@RequestMapping("b4.json")
				public ArrayList b4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_33990103");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=33990103&query=%EB%A1%9C%EC%95%A4%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC%EC%9D%98%EC%9B%90%EC%9D%B8%EC%B2%9C%EA%B5%AC%EC%9B%94%EC%A0%90").get();
					
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
				//산부인과 5개
				@ResponseBody
				@RequestMapping("b5.json")
				public ArrayList b5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13240996");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13240996&query=%EC%9A%B0%EB%A6%AC%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//산부인과 6개
				@ResponseBody
				@RequestMapping("b6.json")
				public ArrayList b6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_37467826");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=37467826&query=%EC%95%84%EC%9D%B4%EC%86%8C%EB%A7%9D%EC%82%B0%EB%B6%80%EC%9D%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//비뇨기과 1개
				@ResponseBody
				@RequestMapping("c1.json")
				public ArrayList c1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_19513486");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=19513486&query=%EC%82%BC%EC%84%B1%EC%88%98%EC%9D%98%EC%9B%90").get();
					
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
				//비뇨기과 2개
				@ResponseBody
				@RequestMapping("c2.json")
				public ArrayList c2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13241089");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241089&query=%ED%98%84%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//비뇨기과 3개
				@ResponseBody
				@RequestMapping("c3.json")
				public ArrayList c3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13241044");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241044&query=%ED%94%BC%EC%95%A4%EB%B9%84%EC%9D%98%EC%9B%90").get();
					
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
				//비뇨기과 4개
				@ResponseBody
				@RequestMapping("c4.json")
				public ArrayList c4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13241427");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241427&query=%EC%9D%B8%ED%95%98%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//비뇨기과 5개
				@ResponseBody
				@RequestMapping("c5.json")
				public ArrayList c5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_37882426");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=37882426&query=%EC%A0%95%ED%95%9C%EC%88%98%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//비뇨기과 6개
				@ResponseBody
				@RequestMapping("c6.json")
				public ArrayList c6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13238740");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13238740&query=%EC%9D%B4%EC%9D%B8%EC%9D%98%EB%B9%84%EB%87%A8%EA%B8%B0%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//성형외과 1개
				@ResponseBody
				@RequestMapping("d1.json")
				public ArrayList d1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_11709005");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11709005&query=%EB%B7%B0%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				
				//성형외과 2개
				@ResponseBody
				@RequestMapping("d2.json")
				public ArrayList d2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_34604998");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=34604998&query=%EC%98%A4%EB%A5%B4%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//성형외과 3개
				@ResponseBody
				@RequestMapping("d3.json")
				public ArrayList d3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_1518147116");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1518147116&query=%EB%82%98%EB%82%98%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//성형외과 4개
				@ResponseBody
				@RequestMapping("d4.json")
				public ArrayList d4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_11876086");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11876086&query=%EB%A6%AC%EC%97%94%EC%9E%A5%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//성형외과 5개
				@ResponseBody
				@RequestMapping("d5.json")
				public ArrayList d5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_34129370");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=34129370&query=%ED%83%80%EB%AF%B8%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//성형외과 6개
				@ResponseBody
				@RequestMapping("d6.json")
				public ArrayList d6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_11891093");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11891093&query=%EC%97%98%EB%A6%AC%ED%8A%B8%EC%84%B1%ED%98%95%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//가정의학과 1개
				@ResponseBody
				@RequestMapping("e1.json")
				public ArrayList e1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13238171");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13238171&query=%ED%98%84%EB%8C%80%EA%B0%80%EC%A0%95%EC%9D%98%EC%9B%90").get();
					
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
				//가정의학과 2개
				@ResponseBody
				@RequestMapping("e2.json")
				public ArrayList e2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_19513486");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=19513486&query=%EC%82%BC%EC%84%B1%EC%88%98%EC%9D%98%EC%9B%90").get();
					
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
				//가정의학과 3개
				@ResponseBody
				@RequestMapping("e3.json")
				public ArrayList e3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_512716757");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=512716757&query=%EA%B3%A0%EB%A0%A4%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//가정의학과 4개
				@ResponseBody
				@RequestMapping("e4.json")
				public ArrayList e4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_36513713");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=36513713&query=%EC%84%B1%EB%AA%A8%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//가정의학과 5개
				@ResponseBody
				@RequestMapping("e5.json")
				public ArrayList e5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_1118199494");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1118199494&query=%EC%82%BC%EC%84%B1%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//가정의학과 6개
				@ResponseBody
				@RequestMapping("e6.json")
				public ArrayList e6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_12808399");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12808399&query=%EC%84%9C%EC%9A%B8%EA%B0%80%EC%A0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//외과 1개
				@ResponseBody
				@RequestMapping("f1.json")
				public ArrayList f1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13106247");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13106247&query=%EC%9C%84%EB%8C%80%ED%95%AD%EB%A7%A5%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//외과 2개
				@ResponseBody
				@RequestMapping("f2.json")
				public ArrayList f2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%99%B8%EA%B3%BC").get();
					
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
					
					
					
					
					Elements el=doc2.select("#_fixed_top_area .tab_detail_area");
					
					Elements e3=el.select(".hospital_info");
						
						map.put("desc", e3.select("div:nth-child(1) .desc").text());//진료기계
					
					
					
						
					array.add(map);	
					return array;
					
					
				}
				//외과3개
				@ResponseBody
				@RequestMapping("f3.json")
				public ArrayList f3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_11462682");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=11462682&query=%EC%9A%B0%EB%A6%AC%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//외과 4개
				@ResponseBody
				@RequestMapping("f4.json")
				public ArrayList f4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_19513908");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=19513908&query=%EC%B0%A8%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//외과 5개
				@ResponseBody
				@RequestMapping("f5.json")
				public ArrayList f5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_12833522");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12833522&query=%EC%98%88%EC%A7%80%ED%95%AD%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//외과 6개
				@ResponseBody
				@RequestMapping("f6.json")
				public ArrayList f6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_1566346714");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=1566346714&query=%EC%A0%95%EB%8B%B4%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경외과 1개
				@ResponseBody
				@RequestMapping("g1.json")
				public ArrayList g1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_19378627");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=19378627&query=%ED%83%91%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
					
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
				//신경외과 2개
				@ResponseBody
				@RequestMapping("g2.json")
				public ArrayList g2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_722512885");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=722512885&query=%EA%B5%BF%EB%8B%A5%ED%84%B0%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경외과 3개
				@ResponseBody
				@RequestMapping("g3.json")
				public ArrayList g3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_38769623");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=38769623&query=%EA%B9%80%EC%A7%84%EC%9A%B1%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경외과 4개
				@ResponseBody
				@RequestMapping("g4.json")
				public ArrayList g4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_37610933");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=37610933&query=%EB%8F%84%ED%99%94%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경외과 5개
				@ResponseBody
				@RequestMapping("g5.json")
				public ArrayList g5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_31986581");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=31986581&query=%ED%98%84%EB%AA%85%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경외과 6개
				@ResponseBody
				@RequestMapping("g6.json")
				public ArrayList g6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EC%99%B8%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_34024423");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=34024423&query=%EC%9D%B8%EC%B2%9C%ED%95%98%EB%82%98%EC%9D%98%EC%9B%90").get();
					
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
				//신경과 1개
				
				@ResponseBody
				@RequestMapping("h1.json")
				public ArrayList h1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13241205");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241205&query=%EC%A0%95%ED%95%AD%EC%9E%AC%EC%8B%A0%EA%B2%BD%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경과 2개
				@ResponseBody
				@RequestMapping("h2.json")
				public ArrayList h2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_38403324");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=38403324&query=%EA%B8%B0%EB%B6%84%EC%A2%8B%EC%9D%80%EC%8B%A0%EA%B2%BD%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경과 3개
				@ResponseBody
				@RequestMapping("h3.json")
				public ArrayList h3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_33237548");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=33237548&query=%EB%B6%80%EC%B2%9C%EB%BD%80%EB%B9%A0%EC%9D%B4%EC%8B%A0%EA%B2%BD%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경과 4개
				@ResponseBody
				@RequestMapping("h4.json")
				public ArrayList h4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13137627");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13137627&query=%EC%9D%B4%ED%83%9C%EA%B7%9C%EC%8B%A0%EA%B2%BD%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경과 5개
				@ResponseBody
				@RequestMapping("h5.json")
				public ArrayList h5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13238824");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13238824&query=%ED%95%9C%EC%96%91%EC%8B%A0%EA%B2%BD%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//신경과 6개
				@ResponseBody
				@RequestMapping("h6.json")
				public ArrayList h6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%8B%A0%EA%B2%BD%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_12896329");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12896329&query=%EB%AF%B8%EB%9E%98%EC%8B%A0%EA%B2%BD%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//정신과 1개
				@ResponseBody
				@RequestMapping("i1.json")
				public ArrayList i1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%A0%95%EC%8B%A0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_70589968");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=70589968&query=%EC%9D%B8%EC%B2%9C%EB%A7%88%EC%9D%8C%EB%B2%97%EC%A0%95%EC%8B%A0%EA%B1%B4%EA%B0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//정신과 2개
				@ResponseBody
				@RequestMapping("i2.json")
				public ArrayList i2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%A0%95%EC%8B%A0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_37637646");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=37637646&query=%EC%A2%8B%EC%9D%80%EC%83%9D%EA%B0%81%EC%A0%95%EC%8B%A0%EA%B1%B4%EA%B0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//정신과 3개
				@ResponseBody
				@RequestMapping("i3.json")
				public ArrayList i3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%A0%95%EC%8B%A0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_34999426");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=34999426&query=%EB%B0%9D%EC%9D%80%EB%A7%88%EC%9D%8C%EC%A0%95%EC%8B%A0%EA%B1%B4%EA%B0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//정신과 4개
				@ResponseBody
				@RequestMapping("i4.json")
				public ArrayList i4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%A0%95%EC%8B%A0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_20514547");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=20514547&query=%EC%8B%A0%EA%B8%B0%EA%B3%A0%EB%A0%A4%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC%EC%A0%95%EC%8B%A0%EA%B1%B4%EA%B0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//정신과 5개
				@ResponseBody
				@RequestMapping("i5.json")
				public ArrayList i5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%A0%95%EC%8B%A0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13533322");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13533322&query=%EA%B9%80%ED%83%9D%EC%88%98%EC%A0%95%EC%8B%A0%EA%B1%B4%EA%B0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//정신고 ㅏ6개
				@ResponseBody
				@RequestMapping("i6.json")
				public ArrayList i6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%A0%95%EC%8B%A0%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_12879667");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=12879667&query=%ED%99%A9%EC%9B%90%EC%A4%80%EC%A0%95%EC%8B%A0%EA%B1%B4%EA%B0%95%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				
				//마취통증의학과 1개
				@ResponseBody
				@RequestMapping("j1.json")
				public ArrayList j1() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_37921312");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=37921312&query=%EC%8B%A0%EA%B8%B0%EC%B0%AC%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//마취통증의학과 2개
				@ResponseBody
				@RequestMapping("j2.json")
				public ArrayList j2() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13108695");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13108695&query=%EC%A3%BC%EC%95%88%EC%97%B0%EC%84%B8%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//마취통증의학과 3개
				@ResponseBody
				@RequestMapping("j3.json")
				public ArrayList j3() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_36383870");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=36383870&query=%ED%95%9C%EC%96%91%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//마취통증의학과 4개
				@ResponseBody
				@RequestMapping("j4.json")
				public ArrayList j4() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13241163");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13241163&query=%EC%A3%BC%EC%95%88%EC%82%AC%EB%9E%91%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//마취통증의학과 5개
				@ResponseBody
				@RequestMapping("j5.json")
				public ArrayList j5() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_37244462");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=37244462&query=%EA%B8%B0%EC%B0%AC%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
				//마취통증의학과 6개
				@ResponseBody
				@RequestMapping("j6.json")
				public ArrayList j6() throws Exception{
					
					ArrayList array=new ArrayList();
					
					HashMap<String,Object> map=new HashMap<String,Object>();
					
					Document doc=Jsoup.connect("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC").get();
					
					Elements es=doc.select(".list_area .list_place_col1");
					
					Elements e=es.select("#_business_13240994");
						
						map.put("title", e.select(".name").text());
						map.put("id", e.select(".list_item_inner").attr("data-nmb_hpl-doc-id"));
						map.put("time",e.select(".time").text());
				
					
					//
					
					Document doc2=Jsoup.connect("https://store.naver.com/hospitals/detail?id=13240994&query=%EC%86%90%ED%98%B8%EA%B7%A0%EB%A7%88%EC%B7%A8%ED%86%B5%EC%A6%9D%EC%9D%98%ED%95%99%EA%B3%BC%EC%9D%98%EC%9B%90").get();
					
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
