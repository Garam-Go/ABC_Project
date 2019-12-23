<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
	<a href="list">목록</a>
	<a href="insert">글쓰기</a>
	<c:if test="${uid==null}">
		<a href="login">로그인</a>
	</c:if>
	<c:if test="${uid != null}">
		<a href="logout">로그아웃</a>
		[ ID : ${uid } ]
	</c:if>