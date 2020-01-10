<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MedicineSearchResult</title>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
	<style>
		table{
			border-color:black;
			border-collapse:collapse;
		}
		.row:hover{
			background:lightgreen;
			cursor: pointer;
		}
	</style>
</head>
<body>
	<!-- 테이블 목록 출력 -->
	<h3>테이블 목록</h3>
		<table id="boxlist" border=1 width=580></table>
		<script id="temp-med" type="text/x-handlebars-template">
				{{#each list}}
				<tr class="row" medcode="{{medcode}}">
					<td width=100 height=50>{{medcode}}</td>
					<td class="medname">{{medname}}</td>
					<td width=100>★100</td>
				</tr>	
				<tr class="med-detail">
					<td colspan=3 height=20>
					<div style="overflow:hidden;text-overflow:ellipsis;width:580px;">
						{{medcontent}}
					</div>
					</td>
				</tr>
				{{/each}}
				</script>
		<button id="more" style="width:100%;margin:20px 0 20px 0;">더보기</button>
</body>
<script>
var keyword=$("#keyword").val();
var page = 1; //결과 페이지 번호
var size = 3; //한 페이지에 보여질 문서의 개수
var is_end ;

//약 상세페이지
$("#boxlist").on("click","tr",function(){
	var mmid = "${mid}";
	var mmrecent = parseInt($(this).attr("medcode"));
	$.ajax({
		type:"get",
		url:"mminsert",
		data:{"mmid":mmid,"mmrecent":mmrecent},
		success:function(){
			//alert("save");
			location.href="medicineDes?medcode="+mmrecent;
		}
	});
})


//더보기버튼 누르기
$("#more").on("click",function(){
	page = page+3;
	size = size +3;
	getmedicine();
});
getmedicine();
var keyword=$("#keyword").val();

//검색
$("#btnsearch").on("click",function(){
	page = 1;
	$("#boxlist").html("");
	keyword=$("#keyword").val();
	getmedicine();	
});
/*테이블 목록 출력*/
function getmedicine(){
	$.ajax({
		type:"get",
		url:"medicine.json",
		data:{"keyword":keyword,"page":page,"perPageNum":size},
		success:function(data){
			//alert(keyword);
			var temp=Handlebars.compile($("#temp-med").html());
			$("#boxlist").append(temp(data));
		}
	});
}
getme();
/*클로링 목록 출력*/
function getme(){
	$.ajax({
		type:"get",
		url:"../me.json",
		success:function(data){
			var temp=Handlebars.compile($("#ctemp").html());
			$("#boxclist").append(temp(data));
		}
	});
}
//페이징
$("#pagination").on("click", "li a", function(event){
	event.preventDefault();
	page = $(this).attr("href");
	getmedicine();
});

</script>
</html>