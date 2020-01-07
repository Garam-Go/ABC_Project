package com.example.domain;

public class MyBasHVO {
	private int mbhid;
	private String mhid;
	private String mhrecent;
	private int mhres;
	private int mhrev;
	public int getMbhid() {
		return mbhid;
	}
	public void setMbhid(int mbhid) {
		this.mbhid = mbhid;
	}
	public String getMhid() {
		return mhid;
	}
	public void setMhid(String mhid) {
		this.mhid = mhid;
	}
	public String getMhrecent() {
		return mhrecent;
	}
	public void setMhrecent(String mhrecent) {
		this.mhrecent = mhrecent;
	}
	public int getMhres() {
		return mhres;
	}
	public void setMhres(int mhres) {
		this.mhres = mhres;
	}
	public int getMhrev() {
		return mhrev;
	}
	public void setMhrev(int mhrev) {
		this.mhrev = mhrev;
	}
	@Override
	public String toString() {
		return "MyBasHVO [mbhid=" + mbhid + ", mhid=" + mhid + ", mhrecent=" + mhrecent + ", mhres=" + mhres
				+ ", mhrev=" + mhrev + "]";
	}
	
	
}
