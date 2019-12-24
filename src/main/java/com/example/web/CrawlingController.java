package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CrawlingController {
	@ResponseBody
	@RequestMapping("medicine.json")
	public List<HashMap<String, Object>> medicine() throws Exception{
		int i=0;
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		Document doc=Jsoup.connect("https://terms.naver.com/medicineSearch.nhn").get();
		Elements es=doc.select(".list_wrap .content_list");
		
		for(Element e:es.select("li")){
			HashMap<String, Object> map= new HashMap<String, Object>();
			map.put("thumbnail", e.select(".listThumbnail").attr("src"));
			map.put("medname", e.select("a strong").text());
			map.put("medcontent", e.select(".desc").text());
			if(!e.select("a strong").text().equals("")&& i<6){
				list.add(map);
				i=i+1;
			}
		}
		return list;
	}
	
}
