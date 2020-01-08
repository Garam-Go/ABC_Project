package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReviewVO {
	
	private int hrevid;
	private String revcontent;
	private int revgrade;
	private String hrevmyid;
	private String h_hcode;
	
	@JsonFormat(pattern="yyyy-MM-dd kk:mm:ss",timezone="Asia/Seoul")
	private Date RevDate;
	
	private String h_name;
	
	
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public Date getHdate() {
		return RevDate;
	}
	public void setHdate(Date hdate) {
		this.RevDate = hdate;
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
	
	
}
