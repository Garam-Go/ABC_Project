package com.example.domain;

public class BookVO {
	//저장하는 사람
	private String mbmyid;
	
	//주소록에 저장되는 상대방
	private String mbid;
	private String mbname;
	public String getMbmyid() {
		return mbmyid;
	}
	public void setMbmyid(String mbmyid) {
		this.mbmyid = mbmyid;
	}
	public String getMbid() {
		return mbid;
	}
	public void setMbid(String mbid) {
		this.mbid = mbid;
	}
	public String getMbname() {
		return mbname;
	}
	public void setMbname(String mbname) {
		this.mbname = mbname;
	}
	@Override
	public String toString() {
		return "BookVO [mbmyid=" + mbmyid + ", mbid=" + mbid + ", mbname=" + mbname + "]";
	}
	
	
}
