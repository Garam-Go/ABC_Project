<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>어드민 메인페이지</title>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="resources/template/main/scripts/main.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700" rel="stylesheet">
<link href="resources/template/main/styles/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<style>
#navbar h1{vertical-align: middle;}
#content{
	 width: 100%;
    height: 800px;
    padding: 10px; 
    overflow: hidden;
}
#inner-navbar {
   background: #9CC89D;
   width: 250px;
   height: 100%;
   float: left;
   padding-top:80px;
   font-size: 16px;
}

#inner-content {
   width: 67%;
   height: 100%;
   margin: 50px;
   float: left;
}
#inner-member{
	border:1px solid;
	padding:10px;
	text-align:center;
	background:white;
	margin-bottom:10px;
}
table{background:white; width:700px;}
</style>
</head>
<body>
<div id="page">

	
   <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="homepage">
      	<img src="resources/logo.png" id="iconimg" width=60 >
      </a>
    	<div id="login">
		<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
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


    <div id="content">
    	<div id="inner-navbar">
    		<ul id="out-ul">
				<li id="out-li">회원관리
					<ul id="in-ul">
						<li><a href="" style="color:black;">회원목록 확인</a></li>
						<li><a href="" style="color:black;">회원 등급전환</a></li>
						<li><a href="NewFile" style="color:black;">신고된 회원 목록</a></li>
						<li><a href="NewFile2" style="color:black;">블랙리스트 목록</a></li>
						<li><a href="NewFile3" style="color:black;">탈퇴회원 관리</a></li>
					</ul>
				</li>
				<li id="out-li">고객센터
					<ul id="in-ul">
						<li><a href="qna" style="color:black;">QnA관리</a></li>
						<li><a href="adminQuestionList" style="color:black;">1:1질문 & 답변</a></li>
						<li><a href="#" style="color:black;">신고된 글 확인</a></li>
					</ul>
				</li>
			</ul>
			</div>
    	<div id="inner-content">
    		<h3 style="margin-top:50px;">신고된 글 확인</h3>
    		<table border=1 width=550 style="background:white;margin-top:50px;">
    			<tr>
    				<td>목록</td>
    				<td>제목</td>
    				<td>작성자</td>
    				<td>신고일</td>
    				
    			</tr>
    			<tr>
    				<td width=70>병원</td>
    				<td>신고합니다</td>
    				<td width=50>kim</td>
    				<td width=80>2019-12-20</td>
    				
    			</tr>
    			<tr>
    				<td>약</td>
    				<td>신고합니다</td>
    				<td width=50>kyo</td>
    				<td width=80>2019-12-05</td>
    				
    			</tr>
    			<tr>
    				<td>약</td>
    				<td>신고글입니다</td>
    				<td width=50>kyo</td>
    				<td width=80>2019-11-12</td>
    				
    			</tr>
    			<tr>
    				<td>커뮤니티</td>
    				<td>신고합니다</td>
    				<td width=50>nam</td>
    				<td width=80>2019-10-02</td>
    				
    			</tr>
    			<tr">
    				<td>약</td>
    				<td>신고합니다</td>
    				<td width=50>nam</td>
    				<td width=80>2019-09-25</td>
    				
    			</tr>
    			<tr">
    				<td>약</td>
    				<td>신고글입니다</td>
    				<td width=50>nam</td>
    				<td width=80>2019-07-08</td>
    				
    			</tr>
    			<tr">
    				<td>병원</td>
    				<td>신고합니다</td>
    				<td width=50>kim</td>
    				<td width=80>2019-07-02</td>
    				
    			</tr>
    			<tr>
    				<td>커뮤니티</td>
    				<td>신고합니다</td>
    				<td width=50>nam</td>
    				<td width=80>2019-06-14</td>
    				
    			</tr>
    			<tr>
    				<td>커뮤니티</td>
    				<td>신고글입니다</td>
    				<td width=50>kyo</td>
    				<td width=80>2019-05-23</td>
    				
    			</tr>
    			<tr>
    				<td>약</td>
    				<td>신고합니다</td>
    				<td width=50>kim</td>
    				<td width=80>2019-04-07</td>
    				
    			</tr>
    			
    		</table>
    			<a href="#">◀</a>
    			<a href="#">1</a>
    			<a href="#">2</a>
    			<a href="#">3</a>
    			<a href="#">4</a>
    			<a href="#">5</a>
    			<a href="#">▶</a>
    			
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

</script>
</html>