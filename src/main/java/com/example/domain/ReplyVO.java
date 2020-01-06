package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReplyVO {
	private int replyid;
	private int medcode;
	private String replyname;
	private String replycontent;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="Asia/Seoul")
	private Date replydate;
	@JsonFormat(pattern="yyyy-MM-dd",timezone="Asia/Seoul")
	private Date replyupdate;
	private int replycommend;
	
	public int getReplyid() {
		return replyid;
	}
	public void setReplyid(int replyid) {
		this.replyid = replyid;
	}
	public int getMedcode() {
		return medcode;
	}
	public void setMedcode(int medcode) {
		this.medcode = medcode;
	}
	public String getReplyname() {
		return replyname;
	}
	public void setReplyname(String replyname) {
		this.replyname = replyname;
	}
	public String getReplycontent() {
		return replycontent;
	}
	public void setReplycontent(String replycontent) {
		this.replycontent = replycontent;
	}
	public Date getReplydate() {
		return replydate;
	}
	public void setReplydate(Date replydate) {
		this.replydate = replydate;
	}
	public Date getReplyupdate() {
		return replyupdate;
	}
	public void setReplyupdate(Date replyupdate) {
		this.replyupdate = replyupdate;
	}
	public int getReplycommend() {
		return replycommend;
	}
	public void setReplycommend(int replycommend) {
		this.replycommend = replycommend;
	}
	@Override
	public String toString() {
		return "ReplyVO [replyid=" + replyid + ", medcode=" + medcode + ", replyname=" + replyname + ", replycontent="
				+ replycontent + ", replydate=" + replydate + ", replyupdate=" + replyupdate + ", replycommend="
				+ replycommend + "]";
	}
	
	
	
}
