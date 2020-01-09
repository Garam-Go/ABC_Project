package com.example.domain;

public class MBasketMVO {
	private String mmid;
	private int mmrecent;
	private int mmfav;
	
	public String getMmid() {
		return mmid;
	}
	public void setMmid(String mmid) {
		this.mmid = mmid;
	}
	public int getMmrecent() {
		return mmrecent;
	}
	public void setMmrecent(int mmrecent) {
		this.mmrecent = mmrecent;
	}
	public int getMmfav() {
		return mmfav;
	}
	public void setMmfav(int mmfav) {
		this.mmfav = mmfav;
	}
	@Override
	public String toString() {
		return "MBasketMVO [mmid=" + mmid + ", mmrecent=" + mmrecent + ", mmfav=" + mmfav + "]";
	}
	
	
}
