package com.example.domain;

import java.util.Date;

public class ReplyVO {
	private int replyid;
	private int boardid;
	private String replyname;
	private String replycontent;
	private Date replydate;
	private Date replyupdate;
	private int replycommend;
	public int getReplyid() {
		return replyid;
	}
	public void setReplyid(int replyid) {
		this.replyid = replyid;
	}
	public int getBoardid() {
		return boardid;
	}
	public void setBoardid(int boardid) {
		this.boardid = boardid;
	}
	public String getReplyname() {
		return replyname;
	}
	public void setReplyname(String replyname) {
		this.replyname = replyname;
	}
	public String getReplycomment() {
		return replycontent;
	}
	public void setReplycomment(String replycomment) {
		this.replycontent = replycomment;
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
		return "ReplyVO [replyid=" + replyid + ", boardid=" + boardid + ", replyname=" + replyname + ", replycomment="
				+ replycontent + ", replydate=" + replydate + ", replyupdate=" + replyupdate + ", replycommend="
				+ replycommend + "]";
	}
	
	
}
