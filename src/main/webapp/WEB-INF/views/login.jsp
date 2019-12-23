<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN</title>
<style>

table, tr, td {
	border-collapse: collapse;
	border: 1px solid;
	margin: 0px auto;
	padding: 30px;
}

#top {
	width: 800px;
	margin: 10px auto;
	padding: 10px;
	background: white;
	box-shadow: 1px 1px 5px gray;
}

#con {
	width: 800px;
	margin: 0 auto;
	padding: 10px;
	background: white;
	box-shadow: 1px 1px 5px gray;
}
</style>

</head>
<body>

	<h1>LOGINLOGIN</h1>
	<div id="con">
	<form action="loginPost" method="post">
		<table>
				<tr>
					<td>아이디 : <input type="text" name="uid"></td>
				</tr>
				<tr>
					<td>비밀번호 : <input type="password" name="upw"></td>
				</tr>
				<tr>
					<td><input type="submit" value="LOGIN" id="btnlogin"></td>
				</tr>
			</table>
	</form>
	<!-- 네이버아이디로 로그인 버튼 노출 영역 -->
	<div id="naver_id_login"></div>
	<!-- //네이버아이디로 로그인 버튼 노출 영역 -->
	<script type="text/javascript">
		var naver_id_login = new naver_id_login("rqO0TDIARI6udRXDMExh", "http://localhost:8088/example/naverlogin");
		var state = naver_id_login.getUniqState();
		naver_id_login.setButton("green", 3, 40);
		naver_id_login.setDomain("YOUR_SERVICE_URL");
		naver_id_login.setState(state);
// 		naver_id_login.setPopup();
		naver_id_login.init_naver_id_login();
		
	</script>
	</div>

</body>

</html>