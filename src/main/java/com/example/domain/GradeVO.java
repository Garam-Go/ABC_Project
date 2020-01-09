package com.example.domain;

import java.util.Date;

public class GradeVO {
	private int gcode;
	private  String h_hcode;
	private String hrevmyid;
	private Date gdate;
	private int grade;
	
	public int getGcode() {
		return gcode;
	}
	public void setGcode(int gcode) {
		this.gcode = gcode;
	}
	public String getH_hcode() {
		return h_hcode;
	}
	public void setH_hcode(String h_hcode) {
		this.h_hcode = h_hcode;
	}
	public String getHrevmyid() {
		return hrevmyid;
	}
	public void setHrevmyid(String hrevmyid) {
		this.hrevmyid = hrevmyid;
	}
	public Date getGdate() {
		return gdate;
	}
	public void setGdate(Date gdate) {
		this.gdate = gdate;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "GradeVO [gcode=" + gcode + ", h_hcode=" + h_hcode + ", hrevmyid=" + hrevmyid + ", gdate=" + gdate
				+ ", grade=" + grade + "]";
	}
	
	
}
