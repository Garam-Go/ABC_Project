<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>----------dsearchhtml--------------------</title>

  <!-- Bootstrap core CSS -->
  <link href="../resources/ddetail/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../resources/ddetail/css/blog-post.css" rel="stylesheet">
  
  	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Start Bootstrap</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Post Content Column -->
      <div class="col-lg-8">

        <!-- Title -->
        <h1 class="mt-4">Post Title</h1>

        <!-- Author -->
        <p class="lead">
          by
          <a href="#">Start Bootstrap</a>
        </p>
		<div>
			
						<!-- 카테고리 별 검색 -->
						<select  class="form-control" id="searchType" style="overflow:hidden;">
							<option value="이비인후과"
								<c:out value="${param.card=='이비인후과'?'selected':''}"/>>이비인후과</option>
							<option value="내과"
								<c:out value="${param.card=='내과'?'selected':''}"/>>내과</option>
							<option value="소아"
								<c:out value="${param.card=='소아'?'selected':''}"/>>소아과</option>
							<option value="피부과"
								<c:out value="${param.card=='피부과'?'selected':''}"/>>피부과</option>
							<option value="정형외과"
								<c:out value="${param.card=='정형외과'?'selected':''}"/>>정형외과</option>
							<option value="안과"
								<c:out value="${param.card=='안과'?'selected':''}"/>>안과</option>
							<option value="치과"
								<c:out value="${param.card=='치과'?'selected':''}"/>>치과</option>
							<option value="한의원"
								<c:out value="${param.card=='한의원'?'selected':''}"/>>한의원</option>
							<option value="산부인과"
								<c:out value="${param.card=='산부인과'?'selected':''}"/>>산부인과</option>
							<option value="비뇨기과"
								<c:out value="${param.card=='비뇨기과'?'selected':''}"/>>비뇨기과</option>
							<option value="성형외과"
								<c:out value="${param.card=='성형외과'?'selected':''}"/>>성형외과</option>
							<option value="가정의학과"
								<c:out value="${param.card=='가정의학과'?'selected':''}"/>>가정의학과</option>
							<option value="외과"
								<c:out value="${param.card=='외과'?'selected':''}"/>>외과</option>
							<option value="신경외과"
								<c:out value="${param.card=='신경외과'?'selected':''}"/>>신경외과</option>
							<option value="신경과"
								<c:out value="${param.card=='신경과'?'selected':''}"/>>신경과</option>
							<option value="정신"
								<c:out value="${param.card=='정신'?'selected':''}"/>>정신과</option>
							<option value="마취통증"
								<c:out value="${param.card=='마취통증'?'selected':''}"/>>마취통증과</option>
						</select> 
						
						<input type="button" value="검색" id="selsearch" class="selsearch" style="float:left;">
						<!-- 직접 검색 -->
		</div>
		<hr>
        <!-- Date/Time -->

		
		<div id="tblr"></div>
		
		<script id="tempr" type="text/x-handlebars-template">
				{{#each .}}
				<div onClick="location.href='Hos-ddetailhtml?h_code={{h_code}}'">
					<div style="margin-top:5px;margin-bottom:5px;">{{h_name}}</div>
					<hr>
				</div>
				{{/each}}
		</script>
			
        <!-- Preview Image -->


        <!-- Post Content -->



		
        

        <!-- Comments Form -->
        <div class="card my-4">
          <h5 class="card-header">리뷰작성</h5>
          <div class="card-body">
            <form>
              <div class="form-group">
                <textarea class="form-control" rows="3"></textarea>
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
            </form>
          </div>
        </div>

        <!-- Single Comment -->
        <div class="media mb-4">
          <img class="d-flex mr-3 rounded-circle" src="http://placehold.it/50x50" alt="">
          <div class="media-body">
            <h5 class="mt-0">Commenter Name</h5>
            Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
          </div>
        </div>

        <!-- Comment with nested comments -->
        <div class="media mb-4">
          <img class="d-flex mr-3 rounded-circle" src="http://placehold.it/50x50" alt="">
          <div class="media-body">
            <h5 class="mt-0">Commenter Name</h5>
            Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.

            <div class="media mt-4">
              <img class="d-flex mr-3 rounded-circle" src="http://placehold.it/50x50" alt="">
              <div class="media-body">
                <h5 class="mt-0">Commenter Name</h5>
                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
              </div>
            </div>

            <div class="media mt-4">
              <img class="d-flex mr-3 rounded-circle" src="http://placehold.it/50x50" alt="">
              <div class="media-body">
                <h5 class="mt-0">Commenter Name</h5>
                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
              </div>
            </div>

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
              <input type="text" class="form-control" placeholder="Search for...">
              <span class="input-group-btn">
                <button class="btn btn-secondary" type="button">Go!</button>
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
                <ul class="list-unstyled mb-0">
                  <li>
                    <a href="#">Web Design</a>
                  </li>
                  <li>
                    <a href="#">HTML</a>
                  </li>
                  <li>
                    <a href="#">Freebies</a>
                  </li>
                </ul>
              </div>
              <div class="col-lg-6">
                <ul class="list-unstyled mb-0">
                  <li>
                    <a href="#">JavaScript</a>
                  </li>
                  <li>
                    <a href="#">CSS</a>
                  </li>
                  <li>
                    <a href="#">Tutorials</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>

        <!-- Side Widget -->
        <div class="card my-4">
          <h5 class="card-header">질문게시판</h5>
          <div class="card-body">
            You can put anything you want inside of these side widgets. They are easy to use, and feature the new Bootstrap 4 card containers!
          </div>
        </div>

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
  <script src="../resources/ddetail/vendor/jquery/jquery.min.js"></script>
  <script src="../resources/ddetail/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
	<script>
	var query = "${param.query}";
	//var theme="${param.theme}";
	//alert(query+"\n"+theme);
	var query2 = $("#query2").val();
	var keyword = $("#keyword").val();
	var themes = "${param.card}";

	var searchType = $("#searchType option:selected").val();
	
	$("#selsearch").trigger("click");
	$(document).ready(function() {
		//페이지가 로딩하자마자 selsearch 버튼을 누르겠음
		$("#selsearch").trigger("click");
	});

	$("#selsearch").on("click", function() {
		//alert("gg");
		searchType = $("#searchType option:selected").val();
		//alert(searchType);
		gettlist();

	});
	$("#btnsearch").on("click", function() {
		keyword = $("#keyword").val();
		//alert(keyword);
		gettlist();
	});
	$("#keyword").keydown(function(key) {
		if (key.keyCode == 13) {
			keyword = $("#keyword").val();
			gettlist();
		}
	});
	gettlist();

	function gettlist() {
		//alert("gg");
		keyword = $("#keyword").val();
		//alert(keyword);

		$.ajax({
			type : "get",
			url : "Hos-slist.json",
			data : {
				"keyword" : searchType,
			},
			success : function(data) {
				//alert(keyword);
				var temp = Handlebars.compile($("#tempr").html());
				$("#tblr").html(temp(data));
			}
		});
	}
	</script>
</html>
