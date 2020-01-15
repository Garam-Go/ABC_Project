<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<c:if test="${mid==null}">
	<a href="login" id="login" style="color:white;">로그인</a>
</c:if>

<c:if test="${mid != null}">
	<c:if test="${mid=='admin'}">
		<a href="AdminMain" style="color:white;">관리자페이지</a>
		<a href="logout" style="color:white;">로그아웃</a>
		<span style="color:white;">[ ID : ${mid } ]</span>
	</c:if>
	<c:if test="${mid !='admin' }">
		<a href="MyPage?mid=${mid}" style="color:white;">마이페이지</a>
		<a href="logout" style="color:white;">로그아웃</a>
		<span style="color:white;">[ ID : ${mid } ]</span>
	</c:if>
</c:if>

	