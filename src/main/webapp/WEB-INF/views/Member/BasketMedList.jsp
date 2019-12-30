<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">

<style>
#inner-navbar{
		background:yellow;
		width:200px;
		height:100%;
		margin: 10px;
		float:left;
		padding:30px;
		font-size:20px;
	}
	#inner-content{
		background:skyblue;
		width:70%;
		height:100%;
		margin: 10px;
		float:left;
	}
	#table-hospital{
		width:800px;
		background:white;
		margin:100px auto;
		
	}
	table tr td{
		border-collapse: collapse;
	}
</style>
</head>
<body>
<div id="page">
	<div id="header">
		<h1>마이페이지</h1>
		<div id="login">
			<jsp:include page="loginmenu.jsp"></jsp:include>
		</div>
	    <div id="navbar">
			<jsp:include page="../navBar.jsp"></jsp:include>
	    </div>
	</div>
	<div id="content">
		<div id="inner-navbar">
			<ul id="out-ul">
					<li id="out-li">나의 보관함
						<ul id="in-ul">
							<li id="in-hos"><a href="BasketHos">병원</a>
								<div id="in-hos-menu">
									<a href="BasketHosRecent">최근 본 병원</a><br>
									<a href="BasketHosRes">병원 예약 관리</a><br>
									<a href="BasketHosRev">리뷰관리</a>
								</div>
							</li>
							<li id="in-med">약
								<div id="in-med-menu">
									<a href="#">최근 검색한 약</a><br>
									<a href="#">내 관심 약</a><br>
									<a href="#">약 댓글 관리</a>
								</div>
							</li>
							<li id="in-com">커뮤
								<div id="in-com-menu">
									<a href="#">내가 쓴 글</a><br>
									<a href="#">내가 쓴 질문</a><br>
									<a href="#">내 댓글 관리</a>
								</div>
							</li>
						</ul>
					</li>
				</ul>
				<ul id="out-ul">
					<li id="out-li">메세지함
						<ul id="in-ul">
							<li>메세지 확인</li>
							<li>주소록</li>
							<li>휴지통</li>
						</ul>
					</li>
				</ul>
				<ul id="out-ul">
					<li id="out-li">고객센터
						<ul id="in-ul">
							<li>QnA</li>
							<li>1:1 질문하기</li>
						</ul>
					</li>
				</ul>
		</div>
		<div id="inner-content">
			<table id="table-hospital" border=1>
				<tr>
					<td colspan=3 style="overflow:hidden; background:lightgreen;">병원저장페이지
						<input type="button" value="수정" style="float:right;">
					</td>
				</tr>
				<tr>
					<td width=200>병원이름</td>
					<td width=300>주소</td>
					<td width=200>전화번호</td>
				</tr>

			</table>
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>