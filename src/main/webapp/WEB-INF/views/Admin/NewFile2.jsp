<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>어드민 메인페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="resources/template/main/scripts/main.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700" rel="stylesheet">
<link href="resources/template/main/styles/main.css" rel="stylesheet">
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
						<li ><a href="" style="color:black;">회원 등급전환</a></li>
						<li><a id="aNew1" href="NewFile" style="color:black;">신고된 회원 목록</a></li>
						<li><a id="aNew2" href="NewFile2" style="color:black;"> 블랙리스트 목록</a></li>
						<li><a href="NewFile3" style="color:black;">탈퇴회원 관리</a></li>
					</ul>
				</li>
				<li id="out-li">고객센터
					<ul id="in-ul">
						<li><a href="qna" style="color:black;">QnA관리</a></li>
						<li><a href="adminQuestionList" style="color:black;">1:1질문 & 답변</a></li>
						<li><a href="adminReport" style="color:black;">신고된 글 확인</a></li>
					</ul>
				</li>
			</ul>
			</div>
    	<div id="inner-content">
    		<h3 style="margin-top:50px;">블랙리스트 목록</h3>
	<table border=1 width=500 style="text-align:center;background:white; margin-top:50px;">
		<tr>
			<td></td>
			<td>아이디</td>
			<td>이름</td>
			<td>가입일자</td>
			<td>현재등급</td>
			<td>신고수</td>
			<td>수락</td>
		</tr>
		<tr>
		<td><input type="checkbox"></td>
			<td>user22</td>
			<td>칼슘</td>
			<td>2019.12.09</td>
			<td>블랙리스트</td>
			<td>6</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>user23</td>
			<td>칼륨</td>
			<td>2019.12.08</td>
			<td>블랙리스트</td>
			<td>5</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>user24</td>
			<td>마그네슘</td>
			<td>2019.12.07</td>
			<td>블랙리스트</td>
			<td>5</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>user25</td>
			<td>바나나</td>
			<td>2019.12.06</td>
			<td>블랙리스트</td>
			<td>5</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>shrjs25@naver.com</td>
			<td>나비</td>
			<td>2019.12.05</td>
			<td>블랙리스트</td>
			<td>6</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>user26@naver.com</td>
			<td>비행기</td>
			<td>2019.12.04</td>
			<td>블랙리스트</td>
			<td>7</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>user27@naver.com</td>
			<td>기차</td>
			<td>2019.12.03</td>
			<td>블랙리스트</td>
			<td>8</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>user28@naver.com</td>
			<td>차표</td>
			<td>2019.12.02</td>
			<td>블랙리스트</td>
			<td>7</td>
			<td><button>해제</button></td>
		</tr>
		<tr>
			<td><input type="checkbox"></td>
			<td>user29@naver.com</td>
			<td>표범</td>
			<td>2019.12.01</td>
			<td>블랙리스트</td>
			<td>6</td>
			<td><button>해제</button></td>
		</tr>
	</table>
	<div style="margin:0px auto; text-align:center;">
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
   
</div>
	<footer class="py-5 bg-dark">
	    <div class="container">
	      <p class="m-0 text-center text-white">Copyright &copy; ABCProject 2020</p>
	    </div>
	    <!-- /.container -->
	  </footer>
</body>

</html>