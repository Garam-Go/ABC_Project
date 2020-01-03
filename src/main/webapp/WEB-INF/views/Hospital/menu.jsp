
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
	

	
	<c:if test="${mid==null}">
		<a href="/Hospital/login">로그인</a>
	</c:if>
	
	<c:if test="${mid!=null}">
		<a href="logout">로그아웃</a>
		[아이디:${mid}]
	</c:if>