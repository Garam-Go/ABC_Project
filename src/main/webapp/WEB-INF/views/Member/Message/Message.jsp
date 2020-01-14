<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="resources/template/main/scripts/main.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700" rel="stylesheet">
<link href="resources/template/main/styles/main.css" rel="stylesheet">


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
<div id="page">
	<div id="header">
	
	  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="homepage">
      	<img src="resources/logo.png" id="iconimg" width=60 >
      </a>
    	<div id="login">
			<jsp:include page="../loginmenu.jsp"></jsp:include>
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
	</div>
	<div id="content">
		<div id="inner-navbar">
			<jsp:include page="../MyNavList.jsp"></jsp:include>
		</div>
		<div id="inner-content">
			<h1>메세지 보내기</h1>
			<div id="message-content">
				<form name="fom" action="message" method="post">
					<input type="hidden" value="${mid }" name="mssender">
					<table id="table-message" border=1>
						<tr>
							<td width=100>제목</td>
							<td width=400>
								<input type="text" size=50 name="mstitle" value="${param.mstitle }">
							</td>
						</tr>
						<tr>
							<td width=100>받는이</td>
							<td width=400 style="overflow:hidden;">
								<input type="text" name="msreceiver" value="${param.msreceiver }">
								<input type="button" value="주소록" id="bookbutton" style="float:right;">
							</td>
						</tr>
						<tr>
							<td width=100>내용</td>
							<td width=400>
								<textarea cols=50 rows=10 name="mscontent"></textarea>
							</td>
						</tr>
					</table>
					<input type="button" value="보내기" id="message-send">
					<input type="reset" value="초기화">
					
				</form>
			</div>
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
<script>
$("#message-send").on("click",function(){
	var mstitle = fom.mstitle.value;
	var mscontent = fom.mscontent.value;
	var mssender = fom.mssender.value;
	var msreceiver = fom.msreceiver.value;
	
	//alert(mstitle+mscontent+mssender+msreceiver);
	
	$.ajax({
		type:"post",
		url:"message",
		data:{"mstitle":mstitle,"mscontent":mscontent,"mssender":mssender,"msreceiver":msreceiver},
		success:function(){
			alert("메세지 전송 성공!");
			location.href="MessageHome";
		}
	});
	
});

</script>
</html>