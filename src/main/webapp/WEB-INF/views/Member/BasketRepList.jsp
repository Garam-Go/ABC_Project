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
		width:67%;     
		height:100%;
		margin: 10px;
		float:left;
	}
	#table-hospital{
		width:600px;
		background:white;
		margin:100px auto;
		
	}
	table, tr, td{
		border-collapse: collapse;
	}
	#basm{
		display:none;
	}
</style>
</head>
<body>
<div id="page">
	<div id="header">
		<div id="login">
			<jsp:include page="loginmenu.jsp"></jsp:include>
		</div>
	    <div id="navbar">
			<jsp:include page="../Nav/navBar.jsp"></jsp:include>
	    </div>
	</div>
	<div id="content">
		<div id="inner-navbar">
			<jsp:include page="MyNavList.jsp"></jsp:include>
		</div>
		<div id="inner-content">
			<select id="FreeSelect" style="width:200px; height:50px; margin:30px;" onchange="selc(this)">
				<option value="free">자유게시판</option>
				<option value="med">약댓글</option>
			</select>
			<div id="basm">
				<jsp:include page="BasketRepListM.jsp"></jsp:include>
			</div>
			<div id="basc">
				<jsp:include page="BasketRepListC.jsp"></jsp:include>
			</div>
			<script>
				function selc(val){
					var sel = val.value;
					alert(sel);
					if(sel.equals("free")){
						$("#basc").show();
						$("#basm").hide();
					}else{
						$("#basm").show();
						$("#basc").hide();
					}
				}
			</script>
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>