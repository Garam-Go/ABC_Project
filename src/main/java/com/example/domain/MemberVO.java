package com.example.domain;

public class MemberVO {
	private String mid;
	private String mpassword;
	private String mname;
	private String mgender;
	private int mstatus;
	
	
	public int getMstatus() {
		return mstatus;
	}
	public void setMstatus(int mstatus) {
		this.mstatus = mstatus;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMgender() {
		return mgender;
	}
	public void setMgender(String mgender) {
		this.mgender = mgender;
	}
	@Override
	public String toString() {
		return "MemberVO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mgender=" + mgender + "]";
	}
	
	
}
