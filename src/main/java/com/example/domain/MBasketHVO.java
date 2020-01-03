package com.example.domain;

public class MBasketHVO {
	private String mhid; // 저장하는 사람 mlogin-mid  참조
	private String mhrecent; // 최근 본 병원
	private int mhres; //병원 예약
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
	
	public int getMhres() {
		return mhres;
	}
	public void setMhres(int mhres) {
		this.mhres = mhres;
	}
	public int getMhreview() {
		return mhreview;
	}
	public void setMhreview(int mhreview) {
		this.mhreview = mhreview;
	}
	
	
	@Override
	public String toString() {
		return "MBasketHVO [mhid=" + mhid + ", mhrecent=" + mhrecent + ", mhres=" + mhres + ", mhreview=" + mhreview
				+ "]";
	}
	
	
}
