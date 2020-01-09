package com.example.domain;

import java.util.Date;

public class ReviewVO {
	
	private int hrevid;
	private String revcontent;
	private int revgrade;
	private String hrevmyid;
	private String h_hcode;
	private Date h_Date;
	private int grade;
	
	public Date getH_Date() {
		return h_Date;
	}
	public void setH_Date(Date h_Date) {
		this.h_Date = h_Date;
	}

	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getH_hcode() {
		return h_hcode;
	}
	public void setH_hcode(String h_hcode) {
		this.h_hcode = h_hcode;
	}
	public int getHrevid() {
		return hrevid;
	}
	public void setHrevid(int hrevid) {
		this.hrevid = hrevid;
	}
	public String getRevcontent() {
		return revcontent;
	}
	public void setRevcontent(String revcontent) {
		this.revcontent = revcontent;
	}
	public int getRevgrade() {
		return revgrade;
	}
	public void setRevgrade(int revgrade) {
		this.revgrade = revgrade;
	}
	public String getHrevmyid() {
		return hrevmyid;
	}
	public void setHrevmyid(String hrevmyid) {
		this.hrevmyid = hrevmyid;
	}
	@Override
	public String toString() {
		return "ReviewVO [hrevid=" + hrevid + ", revcontent=" + revcontent + ", revgrade=" + revgrade + ", hrevmyid="
				+ hrevmyid + ", h_hcode=" + h_hcode + ", h_Date=" + h_Date + ", grade=" + grade + "]";
	}

	
	
	
	
}
