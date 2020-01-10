<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MedicineDes</title>
	<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
	
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
	<style>
		#left{
		width:150px;
		height:410px;
		background:white;
		margin-top:100px;
		margin-left:20px;
		margin-right:20px;
		float:left;
	}
	#left1{
		border:1px solid black;
		width:150px;
		height:170px;
		background:white;
		margin-bottom:70px;
	}
	#center{
		width:600px;
		background:white;
		margin:10px auto;
		float:left;
	}
	#right{
		width:120px;
		height:170px;
		float:right;
		margin-top:100px;
		margin-left:10px;
		margin-right:10px;
	}
	.right1{
		border:1px solid black;
		width:120px;
		height:50px;
		background:white;
		margin-bottom:70px;
	}
	.right2{
		border:1px solid black;
		width:120px;
		height:50px;
		background:white;
	}
	.right1:hover, .right2:hover{
		cursor: pointer;
	}
	
	.center1{
		border:1px solid;
		width:600px;
		margin-bottom:20px;
		padding:10px;
	}
	
	.center3{
	 	width:600px;
	 	height:25px;
	 	margin-bottom:30px;
	 	text-align:center;
	}
	.center4{
	 	border:1px solid;
	 	width:600px;
	 	height:310px;
	 	margin:0 auto;
	 	padding:5px;
	}
	table{
		border-color:black;
		border-collapse:collapse;
	}
	#replytbl{
		border-color:white;
		padding:5px;
	}
	a{text-decoration: none;}
	.active{color:red;}
	#pagination{
		height:30px;
	}
</style>
</head>
<body>
	<div id="page">
	<div id="login">
			<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
		</div>
		<div id="navbar">
			<jsp:include page="../Nav/navBar.jsp"></jsp:include>
		</div>
		
		<div id="search" style="margin-bottom:10px;">
			<input type="text" id="keyword">
			<input type="button" id="btnsearch" value="검색">
		</div>
		
		<div id="content">
			<div id="left">
				<jsp:include page="left.jsp"></jsp:include>
			</div>
			<div id="center">
				<div class="center1">
				<table border=1 width=600>
						<tr>
							<td id="medcode">${vo.medcode}</td>
							<td>${vo.medname}</td>
							<td>추천수★</td>
						</tr>
					</table>
					<div style="font-size:16px;">${vo.medcontent}...</div>
				</div>
				<div class="center3">
					이 글을 추천합니다 <a href="#">☆</a>
				</div>
				<div class="center4">
					댓글 : 
					<input type="text" size=50 id="replytext">
					<input type="button" value="등록" id="btninsert">

					<table id="replytbl" border=1 width=600></table>
					<script id="temp" type="text/x-handlebars-template">
					{{#each list}}
					<tr class="row" replyid="{{replyid}}">
						<input type="hidden" id="medcode" value={{medcode}}>
						<td width=40 id="replyid" style="font-size:12px;">{{replyid}}</td>
						<td style="text-align:left;">{{replyname}}</td>
						<td style="text-align:right;">{{replydate}}</td>
						<td width=30><button  replyid="{{replyid}}" medcode="{{medcode}}">X</button></td>
					</tr>
					<tr>
						<td colspan=4 height=25>{{replycontent}}</td>
					</tr>
					{{/each}}
					</script>
					<div id="pagination"></div>
				</div>
			</div>
			<div id="right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
		
	</div>
</body>
<script>
var keyword=$("#keyword").val();
var page = 1;
//alert(medcode);

getmreply();

var page=1;

//댓글목록 출력
function getmreply(){
	var medcode="${vo.medcode}";
	//alert(medcode);
	$.ajax({
		type:"get",
		url:"mreplylist",
		data:{"medcode":medcode,"page":page},
		success:function(data){
			var temp=Handlebars.compile($("#temp").html());
			$("#replytbl").html(temp(data));
			
			var str="";
			if(data.pm.prev){
				str += "<a href='" + (data.pm.startPage-1) + "'>[이전] </a>";
			}
			for(var i=data.pm.startPage; i<=data.pm.endPage;i++){
				if(data.pm.cri.page==i){
					str += "<a href='" + i + "' class='active'>[ " + i + " ] </a>"	
				}else{
					str += "<a href='" + i + "'>[ " + i + " ] </a>"
				}
			}
			if(data.pm.next){
				str += "<a href='" + (data.pm.endPage+1) + "'>[다음]</a>";
			}
			$("#pagination").html(str);
		}
	});
}

$("#pagination").on("click","a", function(e){
	e.preventDefault();
	page=$(this).attr("href");
	getmreply();
});

$("#btnsearch").on("click",function(){
	is_end=false;
	page = 1;
	$("#boxlist").html("");
	keyword=$("#keyword").val();
	getmedicine();
});

//댓글입력
$("#btninsert").on("click", function(){
	var medcode="${vo.medcode}";
	var replyname="${mid}";
	//alert(row);	
	var replytext=$("#replytext").val();
	//alert(medcode+replyname+replytext);
	//alert(replyid);
	if(replytext==""){
		alert("댓글 내용을 입력하세요");
		$("#replytext").focus();
	}else{
		$.ajax({
			type:"post",
			url:"mreplyinsert",
			data:{"medcode":medcode, "replyname":replyname, "replycontent":replytext},
			success:function(){
				//alert("성공");
				$("#replytext").val("");
				getmreply();
			}
		});
	}
});
//삭제
$("#replytbl").on("click", ".row button", function(){
	var medcode=$(this).attr("medcode");
	var replyid=$(this).attr("replyid");
	alert(medcode + replyid);
	$.ajax({
		type:"post",
		url:"mreplydelete",
		data:{"medcode":medcode,"replyid":replyid},
		success:function(){
			getmreply();
		}
	});
});
</script>
</html>