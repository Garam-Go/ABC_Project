package com.example.domain;

public class MBasketHVO {
	private String mhid; // �����ϴ� ��� mlogin-mid  ����
	private String mhrecent; // �ֱ� �� ����
	private int res; //���� ����
	private int mhreview; //���� ����(�������̺� ���̵� ����)
	
	
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
