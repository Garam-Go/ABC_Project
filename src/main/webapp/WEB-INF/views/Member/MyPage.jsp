<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css"	rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="resources/template/main/scripts/main.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700" rel="stylesheet">
<link href="resources/template/main/styles/main.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>

<style>
#inner-navbar {
   background: #9CC89D;
   width: 250px;
   height: 100%;
   float: left;
   padding-top:80px;
   font-size: 18px;
}

#inner-content {
   width: 67%;
   height: 100%;
   margin: 50px;
   float: left;
}

#table-profile {
	width:600px;
   background:white;
   margin:100px auto;
}

table tr td {
	border-collapse: collapse;
}

</style>
</head>
<body>
<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="homepage">
      	<img src="resources/logo.png" id="iconimg" width=60 >
      </a>
      <div id="login">
				<jsp:include page="loginmenu.jsp"></jsp:include>
		</div>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="homepage">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Hos-bmain">병원검색</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="bmed_list">약검색</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="comu_clist">커뮤니티</a>
          </li>
    
          <li class="nav-item">
            <a class="nav-link" href="MyPage?mid=${mid}">마이페이지</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

	<div id="page">
		<div id="header">
			
		</div>
		<div id="content">
			<div id="inner-navbar">
				<jsp:include page="MyNavList.jsp"></jsp:include>
			</div>
			<div id="inner-content">
				<table id="table-profile" border=1>
					<tr>
						<td colspan=3 style="overflow: hidden; background: lightgreen;">프로필
							<input type="button" value="수정" style="float: right;">
						</td>


					</tr>
					<tr>
						<td rowspan=5 width=150>
							<img src="http://placehold.it/200x250">
						</td>
						<td width=100>이름</td>
						<td width=250>${my.mname }</td>
					</tr>
					<tr>

						<td width=100>아이디</td>
						<td width=250>${my.mid }</td>
					</tr>
					<tr>

						<td width=100>현재 등급</td>
						<td width=250>
							<c:if test="${my.mstatus==1 }">일반</c:if>
							<c:if test="${my.mstatus==2 }">전문의</c:if>
							<c:if test="${my.mstatus==3 }">블랙리스트</c:if>
							<c:if test="${my.mstatus==4 }">탈퇴</c:if>
						</td>
					</tr>
					<tr>

						<td width=100>가입일</td>
						<td width=250></td>
					</tr>
					<tr>

						<td width=100>신고수</td>
						<td width=250></td>
					</tr>
					<tr>
						<td><input type="button" value="저장"> <input
							type="button" value="취소"></td>
						<td width=100></td>
						<td width=250></td>
					</tr>
				</table>
			</div>
		</div>
		
	</div>
	<footer class="py-5 bg-dark">
	    <div class="container">
	      <p class="m-0 text-center text-white">Copyright &copy; ABCProject 2020</p>
	    </div>
	    <!-- /.container -->
	  </footer>
</body>
</html>