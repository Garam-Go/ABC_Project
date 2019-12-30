<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
	<c:if test="${mid==null}">
		<a href="login" id="login">로그인</a>
	</c:if>
	<c:if test="${mid != null}">
		<a href="MyPage?mid=${mid}">마이페이지</a>
		<a href="logout">로그아웃</a>
		[ ID : ${mid } ]
	</c:if>