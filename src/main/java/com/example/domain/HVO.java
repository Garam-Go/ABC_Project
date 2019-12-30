package com.example.domain;

public class HVO {
	private String h_code;
	private String h_name;
	private String h_time;
	private String h_address;
	private String h_machine;
	private String h_phone;
	
	public String getH_time() {
		return h_time;
	}
	public String getH_address() {
		return h_address;
	}
	public void setH_address(String h_address) {
		this.h_address = h_address;
	}
	public String getH_machine() {
		return h_machine;
	}
	public void setH_machine(String h_machine) {
		this.h_machine = h_machine;
	}
	public String getH_phone() {
		return h_phone;
	}
	public void setH_phone(String h_phone) {
		this.h_phone = h_phone;
	}
	public void setH_time(String h_time) {
		this.h_time = h_time;
	}
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
		return "HVO [h_code=" + h_code + ", h_name=" + h_name + ", h_time=" + h_time + ", h_address=" + h_address
				+ ", h_machine=" + h_machine + ", h_phone=" + h_phone + "]";
	}
	
	
	
}
