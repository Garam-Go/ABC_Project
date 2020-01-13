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
	
	private int rid;
	private int pid;
	private int plus;
	private int minus;
	private int reply;
	private String mid;
	private String content;
	
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")
	private Date wdate;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPlus() {
		return plus;
	}
	public void setPlus(int plus) {
		this.plus = plus;
	}
	public int getMinus() {
		return minus;
	}
	public void setMinus(int minus) {
		this.minus = minus;
	}
	public int getReply() {
		return reply;
	}
	public void setReply(int reply) {
		this.reply = reply;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	
}
