package com.example.domain;

public class HVO {
	private String h_code;
	private String h_name;
	public String getH_code() {
		return h_code;
	}
	public void setH_code(String h_code) {
		this.h_code = h_code;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	@Override
	public String toString() {
		return "HVO [h_code=" + h_code + ", h_name=" + h_name + "]";
	}
	
	
}
