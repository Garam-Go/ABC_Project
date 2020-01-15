<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="${pageContext.request.contextPath}/resources/test.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="resources/template/main/scripts/main.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700"
	rel="stylesheet">
<link href="resources/template/main/styles/main.css" rel="stylesheet">
<style>
.health {
	width: 280px;
	text-overflow: ellipsis;
	white-space: nowrap;
	overflow: hidden;
	text-align: left;
}

.hos {
	width: 160px;
	text-overflow: ellipsis;
	white-space: nowrap;
	overflow: hidden;
	text-align: left;
}

.active {
	color: black
}

#inner-navbar {
	background: #9CC89D;
	width: 250px;
	height: 100%;
	float: left;
	padding-top: 80px;
	font-size: 18px;
}

#inner-content {
	width: 67%;
	height: 100%;
	margin: 50px;
	float: left;
}

#table-profile {
	width: 600px;
	background: white;
	margin: 100px auto;
}

table tr td {
	border-collapse: collapse;
}
</style>
<title>건강정보 게시판</title>
<link href="resources/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="homepage"> <img
			src="resources/logo.png" id="iconimg" width=60>
		</a>
		<div id="login">
			<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
		</div>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="homepage">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="Hos-bmain">병원검색</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="bmed_list">약검색</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="comu_clist">커뮤니티</a>
				</li>
			
				<li class="nav-item"><a class="nav-link"
					href="MyPage?mid=${mid}">마이페이지</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div id="page">


		<div id="content" style="overflow: hidden">

			<div style="width: 800px; overflow: hidden; margin:0 auto;">
				<!-- head -->
				<div
					style="width: 300px; height: 200px; float: left; margin-left: 50px;">
					<div
						style="text-align: right; padding-right: 10px; font-size: 20px;">
						<b><a href="comu_clist" style="text-decoration: none; color:black;">+</a></b>
					</div>
					<div>
						<table border=1 width=280 style="border-collapse:collapse; background:white; box-shadow:3px 3px 3px darkgray;">
							<c:forEach var="cvo" items="${clist}">
								<tr>
									<td>${cvo.title}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>

				<div
					style="width: 300px; height: 150px; float: right; margin-right: 50px;">
					<div
						style="text-align: right; padding-right: 10px; font-size: 20px;">
						<b><a href="comu_qlist" style="text-decoration: none; color:black;">+</a></b>
					</div>

					<div>
						<table border=1
							style="border-collapse: collapse; text-align: center; background:white; box-shadow:3px 3px 3px darkgray;">
							<c:forEach var="qvo" items="${qlist}" begin="0" end="4">
								<tr>
									<td><div class=health>${qvo.title}</div></td>
								</tr>

							</c:forEach>
						</table>
					</div>
				</div>
			</div>

			<div id="content-left"
				style="margin: 50px 0px 0px 150px; overflow: hidden; width: 580px;">



				<span style="float: right"> <input type="text" id=keyword
					size=10> <input type="button" value="검색" id="btnsearch">
				</span> <span id="total" style="float: left"> </span>

				<table id="tbl" border=1 width=580></table>
				<script id="temp" type="text/x-handlebars-template">
				{{#each hlist}}
					<tr>
						<td class=title>
							<div>
								<a href="http://www.bosa.co.kr/news/{{link}}" style="text-decoration:none; color:black;">
									{{title}}
								</a>
							</div>
							<div class=wdate>
								{{wdate}}
							</div>
						</td>
					</tr>
				{{/each}}
			</script>


				<div style="overflow: hidden">
					<span>
						<button id="prev" style="float: left">◀</button>
					</span> <span>
						<button id="next" style="float: right">▶</button>
					</span>
				</div>
			</div>

			<div id="content-right"
				style="width: 180px; float: right; margin: 100px 50px 0px 20px; background: lightgray;">
				<input type="button" value="메세지함"
					style="width: 100px; height: 75px; margin: 10px;"> <input
					type="button" value="질문게시판"
					style="width: 100px; height: 75px; margin: 10px;"
					onClick="location.href='comu_qlist'"> <input type="text"
					id="query" style="width: 160px; margin: 10px;">

				<table id="boxh" border=1 width=180
					style="border-collapse: collapse; overflow: hidden;"></table>
				<script id="temph" type="text/x-handlebars-template">	
				{{#each hlist}}
					<tr>
						<td>
							<div class=hos>
								<a href="comu_community?h_code={{h_code}}&h_name={{h_name}}" style="text-decoration:none; color:black;">
									{{h_name}}
								</a>
							</div>
						</td>
					</tr>	
				{{/each}}
				</script>

				<!-- 병원목록 페이지 버튼 -->
				<div>
					<span>
						<button id="btnprev">◀</button>
					</span> <span>
						<button id="btnnext">▶</button>
					</span>
				</div>

			</div>


		</div>


	</div>
	<footer class="py-5 bg-dark">
	<div class="container">
		<p class="m-0 text-center text-white">Copyright &copy; ABCProject
			2020</p>
	</div>
	<!-- /.container --> </footer>

</body>
<script>
	var page1 = 1;
	var query = $("#query").val();
	var page = 1;
	var keyword = $("#keyword").val();

	$("#prev").on("click", function() {
		if (page > 1) {
			page = page - 1;
			getlist();
		} else {
			alert("뒤로 갈 수 없습니다.")
		}
	});

	$("#next").on("click", function() {
		page = page + 1;
		getlist();
	});

	//검색
	$("#btnsearch").on("click", function() {
		keyword = $("#keyword").val();
		page = 1;
		getlist();
	});

	//키 검색
	$("#keyword").keyup(function(key) {
		if (key.keyCode == 13) {
			keyword = $("#keyword").val();
			page = 1;
			getlist();
		}
	});

	getlist();

	//리스트
	function getlist() {
		$.ajax({
			type : "get",
			url : "healthlist.json",
			data : {
				"page" : page,
				"keyword" : keyword
			},
			success : function(data) {
				var temp = Handlebars.compile($("#temp").html());
				$("#tbl").html(temp(data));
				$("#total").html(data.total);
			}
		});
	}

	var htotal = 1;

	// 병원 목록 이전 다음
	$("#btnprev").on("click", function() {
		if (page1 > 1) {
			page1 = page1 - 1;
			gethlist();
		}
	});

	$("#btnnext").on("click", function() {
		if ((page1 * 10) < htotal) {
			page1 = page1 + 1;
			gethlist();
		}
	});

	//키 검색
	$("#query").keyup(function(key) {
		if (key.keyCode == 13) {
			query = $("#query").val();
			page1 = 1;
			gethlist();
		}
	});

	gethlist();

	//리스트
	function gethlist() {
		$.ajax({
			type : "get",
			url : "community.json",
			data : {
				"page" : page1,
				"keyword" : query
			},
			success : function(data) {
				var temp = Handlebars.compile($("#temph").html());
				$("#boxh").html(temp(data));

				htotal = data.pm.totalCount;
			}
		});
	}
</script>
</html>