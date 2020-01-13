package com.example.domain;

public class HsearchVO {

	private String h_name;
	private String h_code;
	
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public String getH_code() {
		return h_code;
	}
	public void setH_code(String h_code) {
		this.h_code = h_code;
	}
	
	@Override
	public String toString() {
		return "HsearchVO [h_name=" + h_name + ", h_code=" + h_code + "]";
	}	
}
