package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MessageVO {
	
	private String msid;
	private String mstitle;
	private String mscontent;
	
	@JsonFormat(pattern="yyyy-MM-dd kk:mm",timezone="Asia/Seoul")
	private Date msdate;
	private String mssender;
	private String msreceiver;
	
	
	public String getMsid() {
		return msid;
	}
	public void setMsid(String msid) {
		this.msid = msid;
	}
	public String getMstitle() {
		return mstitle;
	}
	public void setMstitle(String mstitle) {
		this.mstitle = mstitle;
	}
	public String getMscontent() {
		return mscontent;
	}
	public void setMscontent(String mscontent) {
		this.mscontent = mscontent;
	}
	public Date getMsdate() {
		return msdate;
	}
	public void setMsdate(Date msdate) {
		this.msdate = msdate;
	}
	public String getMssender() {
		return mssender;
	}
	public void setMssender(String mssender) {
		this.mssender = mssender;
	}
	public String getMsreceiver() {
		return msreceiver;
	}
	public void setMsreceiver(String msreceiver) {
		this.msreceiver = msreceiver;
	}
	@Override
	public String toString() {
		return "MessageVO [mstitle=" + mstitle + ", mscontent=" + mscontent + ", msdate=" + msdate + ", mssender="
				+ mssender + ", msreceiver=" + msreceiver + "]";
	}
	
	
}
