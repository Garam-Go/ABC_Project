package com.example.domain;

public class MessageVO {
	private String mstitle;
	private String mscontent;
	private String msdate;
	private String mssender;
	private String msreceiver;
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
	public String getMsdate() {
		return msdate;
	}
	public void setMsdate(String msdate) {
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
