package com.example.domain;

import java.util.Date;

public class MedicineVO {
	private int medcode;
	private String thumbnail;
	private String medname;
	private String medcontent;
	private String medingre;
	private int recommendcnt;
	private Date meddate;
	
	public String getMedingre() {
		return medingre;
	}
	public void setMedingre(String medingre) {
		this.medingre = medingre;
	}
	public int getMedcode() {
		return medcode;
	}
	public void setMedcode(int medcode) {
		this.medcode = medcode;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getMedname() {
		return medname;
	}
	public void setMedname(String medname) {
		this.medname = medname;
	}
	public String getMedcontent() {
		return medcontent;
	}
	public void setMedcontent(String medcontent) {
		this.medcontent = medcontent;
	}
	public int getRecommendcnt() {
		return recommendcnt;
	}
	public void setRecommendcnt(int recommendcnt) {
		this.recommendcnt = recommendcnt;
	}
	public Date getMeddate() {
		return meddate;
	}
	public void setMeddate(Date meddate) {
		this.meddate = meddate;
	}
	@Override
	public String toString() {
		return "MedicineVO [medcode=" + medcode + ", thumbnail=" + thumbnail + ", medname=" + medname + ", medcontent="
				+ medcontent + ", recommendcnt=" + recommendcnt + ", meddate=" + meddate + "]";
	}
	
	
}
