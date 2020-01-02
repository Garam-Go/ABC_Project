package com.example.domain;

public class MBasketHVO {
	private String mhid; // 저장하는 사람 mlogin-mid  참조
	private String mhrecent; // 최근 본 병원
	private int res; //병원 예약
	private int mhreview; //병원 리뷰(리뷰테이블에 아이디 참조)
	
	
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
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public int getMhreview() {
		return mhreview;
	}
	public void setMhreview(int mhreview) {
		this.mhreview = mhreview;
	}
	
	
}
