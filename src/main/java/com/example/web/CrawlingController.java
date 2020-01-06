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
public class CrawlingController {
	@ResponseBody
	@RequestMapping("me.json")
	public List<HashMap<String, Object>> medicine() throws Exception{
		int i=0;
		List<HashMap<String, Object>> mlist = new ArrayList<HashMap<String, Object>>();
		Document doc=Jsoup.connect("https://terms.naver.com/medicineSearch.nhn?page=7").get();
		Elements es=doc.select(".list_wrap .content_list");
		
		for(Element e:es.select("li")){
			HashMap<String, Object> map= new HashMap<String, Object>();
			map.put("medcode", e.select(".btn_txt").attr("data-contentsid"));
			map.put("thumbnail", e.select("img").attr("src"));
			map.put("medname", e.select("a strong").text());
			map.put("medcontent", e.select(".desc").text());
			if(!e.select("a strong").text().equals("")){
				mlist.add(map);
				i=i+1;
			}
		}
		return mlist;
	}
	@ResponseBody
    @RequestMapping("medicineIngre.json")
         public ArrayList<HashMap<String,Object>> medicineIngre(){
       ArrayList<HashMap<String,Object>> ilist= new ArrayList<HashMap<String,Object>>();
       
       System.setProperty("webdriver.chrome.driver", "C:/spring/chromedriver.exe");
       ChromeOptions option=new ChromeOptions();
       option.addArguments("headless");
       WebDriver driver=new ChromeDriver(option);
       
       driver.get("http://www.health.kr/searchIngredient/search.asp");
       
       WebElement btnTheme1=driver.findElement(By.id("frm")).findElement(By.id("initalselect")).findElement(By.id("li_init1"));
       btnTheme1.click();
       
       WebElement btnTheme2=driver.findElement(By.id("frm")).findElement(By.className("efftAll")).findElement(By.className("ico"));
       btnTheme2.click();
       
       WebElement btnTheme=driver.findElement(By.id("frm")).findElement(By.tagName("fieldset")).findElement(By.id("btns")).findElement(By.className("search"));
       btnTheme.click();
       
       WebElement theme = driver.findElement(By.id("retult_tbl"));
       
       List<WebElement> themes=theme.findElement(By.tagName("tbody")).findElements(By.className("name_kor"));
       for(WebElement e:themes){
         HashMap<String,Object> map=new HashMap<String,Object>();
         map.put("name",e.getText());
        ilist.add(map);
       }
       driver.quit();
       return ilist;
    }
}
