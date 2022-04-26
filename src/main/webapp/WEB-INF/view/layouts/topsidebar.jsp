<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${pageContext.request.contextPath}">Mắt
				Việt</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="item"><a href="${pageContext.request.contextPath}">Trang
					chủ</a></li>
			<li class="item"><a
				href="${pageContext.request.contextPath}/social-media">Truyền
					thông</a></li>
			<li class="item"><a
				href="${pageContext.request.contextPath}/discount">Khuyến mãi</a></li>
			<li class="item"><a
				href="${pageContext.request.contextPath}/recruitment">Tuyển dụng</a></li>
			<li class="item"><a
				href="${pageContext.request.contextPath}/about">Giới thiệu</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a
				href="${pageContext.request.contextPath}/register/showRegistrationForm"><span
					class="glyphicon glyphicon-user"></span> Đăng ký</a></li>
			<li><a href="${pageContext.request.contextPath}/showMyLoginPage">
					<span class="glyphicon glyphicon-log-in"></span> Đăng nhập
			</a></li>
		</ul>
	</div>
</nav>
<div class="col-md-12">
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
				<img src="${slide1}">
			</div>

			<div class="item">
				<img src="${slide2}">
			</div>

			<div class="item">
				<img src="${slide3}">
			</div>

			<div class="item">
				<img src="${slide4}">
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
</div>
<div class="container">