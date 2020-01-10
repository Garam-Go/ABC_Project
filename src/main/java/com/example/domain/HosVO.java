package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HosVO {
	private String hcode;
	private int hid;
	private String type;
	private String title;
	private String fname;
	private String content;
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date wdate;
	private String image;
	private String file;
	private int num;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHcode() {
		return hcode;
	}
	public void setHcode(String hcode) {
		this.hcode = hcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
	@Override
	public String toString() {
		return "HosVO [hcode=" + hcode + ", hid=" + hid + ", type=" + type + ", title=" + title + ", fname=" + fname
				+ ", content=" + content + ", wdate=" + wdate + ", image=" + image + ", file=" + file + ", num=" + num
				+ "]";
	}
	
}
