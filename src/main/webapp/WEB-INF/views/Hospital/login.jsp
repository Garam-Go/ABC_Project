<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>로그인</title>
	<link href="resources/main.css"rel="stylesheet">
	<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
  	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<body>
	<h1>로그인</h1>
	<div id="top"><!-- 메뉴  -->
		<jsp:include page="menu.jsp"></jsp:include>
	</div>
	<div>
		<form action="loginPost" method="post">
		<table border=1 width=300>
			<tr>
				<td>아이디:<input type="text" name="mid"></td>
				<td rowspan="2"><input type="submit" value="로그인"></td>
			</tr>
			<tr>
				<td>비밀번호:<input type="password" name="mpassword"></td>
			</tr>
		</table>
		</form>
		 <!-- 네이버아이디로로그인 버튼 노출 영역 -->
  		 <div id="naver_id_login"></div>
	</div>
</body>

<script type="text/javascript">
	  var naver_id_login = new naver_id_login("bVUfJI9b5PEm8N3LzyET", "http://localhost:8088/web/naverLogin");
	  var state = naver_id_login.getUniqState();
	  
	  naver_id_login.setButton("white", 10,40);
	  naver_id_login.setDomain("YOUR_SERVICE_URL");
	  naver_id_login.setState(state);
	  //naver_id_login.setPopup();
	  naver_id_login.init_naver_id_login();
 </script>
</html>
