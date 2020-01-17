<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>약 세부정보</title>

  <!-- Bootstrap core CSS -->
  <link href="resources/template/med-list/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="resources/template/med-list/css/blog-home.css" rel="stylesheet">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
  <style>
  		.center3{
	 	width:600px;
	 	height:25px;
	 	margin-bottom:30px;
	 	text-align:center;
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



  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Blog Entries Column -->
      <div class="col-md-8">

        <h1 class="my-4">약 세부정보
          <small></small>
        </h1>

        <!-- Blog Post -->
        <div class="card mb-4">
          <div class="card-body">
            <h2 class="card-title">${vo.medname}</h2>
            <p class="card-text"></p>
          </div>
          <div class="card-body">
          	<p class="card-text">${vo.medcontent}....</p>
          </div>
          <div class="card-body">
          	<p class="card-text">추천수★</p>
          </div>
        </div>

        <!-- Blog Post -->
        <div class="card mb-4">
          <div class="card-body">
           <h4 class="card-title">댓글</h4>
           <div class="input-group">
              <input type="text"  class="form-control" placeholder="댓글을 입력하세요" id="replytext">
              <span class="input-group-btn">
                <button class="btn btn-secondary" type="button" id="btninsert">등록</button>              </span>
            </div>
            <div class="center3">
            	이 글을 추천합니다.<a href="#">★</a>
            </div>
            
            <p class="card-text">댓글 리스트</p>
            	<table id="replytbl" border=1 width=700></table>
					<script id="temp" type="text/x-handlebars-template">
					{{#each list}}
					<tr class="replyrow" replyid="{{replyid}}">
						<input type="hidden" id="medcode" value={{medcode}}>
						<td width=30 id="replyid" style="font-size:12px;">{{replyid}}</td>
						<td width=100>{{replyname}}</td>
						<td style="text-align:right;">{{replydate}}</td>
						<td width=30><button replyid="{{replyid}}" medcode="{{medcode}}">X</button></td>
					</tr>
					<tr>
						<td colspan=4>{{replycontent}}</td>
					</tr>
					{{/each}}
					</script>
					<div id="pagination"></div>
          </div>
        </div>

      </div>

      <!-- Sidebar Widgets Column -->
      <div class="col-md-4">

        <!-- Search Widget -->
        <div class="card my-4">
          <h5 class="card-header">Search</h5>
          <div class="card-body">
            <div class="input-group">
              <input type="text" placeholder="Search for..." id="keyword">
              <span class="input-group-btn">
                <button class="btn btn-secondary" id="btnsearch" type="button">검색</button>
              </span> 
            </div>
          </div>
        </div>

        <!-- Categories Widget -->
        <div class="card my-4">
          <h5 class="card-header">메세지함</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              	<a href="MessageHome">메세지함</a>
              </div>
              <div class="col-lg-6">
             
              </div>
            </div>
          </div>
        </div>
        
        <!-- Categories Widget -->
        <div class="card my-4">
          <h5 class="card-header">질문게시판</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              	<a href="comu_qlist">질문게시판</a>
              </div>
              <div class="col-lg-6">
             
              </div>
            </div>
          </div>
        </div>

        <!-- Side Widget -->
     

      </div>

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="resources/template/med-list/vendor/jquery/jquery.min.js"></script>
  <script src="resources/template/med-list/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

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

	keyword=$("#keyword").val();
	location.href="bmed_list?keyword="+keyword;
});

//댓글입력
$("#btninsert").on("click", function(){
	var medcode="${vo.medcode}";
	var replyname="${mid}";
	//alert(row);	
	var replytext=$("#replytext").val();
	//alert(medcode+replyname+replytext);
	//alert(replyid);
	var mid = "${mid}";
	if(mid==""){
		alert("로그인 후 이용해주세요.");
		location.href="login";
		return false;
	}
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
$("#replytbl").on("click", ".replyrow button", function(){
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
