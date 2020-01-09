package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

public class ReviewVO {
	
	private int hrevid;
	private String revcontent;
	private int revgrade;
	private String hrevmyid;
	private String h_hcode;
	
	@JsonFormat(shape=Shape.STRING, pattern="yyyy-MM-dd kk:mm:ss", timezone="GMT+9")
	private Date RevDate;
	
	private String h_name;
	
	
	
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



	public String getH_hcode() {
		return h_hcode;
	}



	public void setH_hcode(String h_hcode) {
		this.h_hcode = h_hcode;
	}



	public Date getRevDate() {
		return RevDate;
	}



	public void setRevDate(Date revDate) {
		RevDate = revDate;
	}



	public String getH_name() {
		return h_name;
	}



	public void setH_name(String h_name) {
		this.h_name = h_name;
	}



	@Override
	public String toString() {
		return "ReviewVO [hrevid=" + hrevid + ", revcontent=" + revcontent + ", revgrade=" + revgrade + ", hrevmyid="
				+ hrevmyid + ", h_hcode=" + h_hcode + ", RevDate=" + RevDate + ", h_name=" + h_name + "]";
	}
	
	
}
