<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Anime Template">
<meta name="keywords" content="Anime, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Anime | Template</title>

</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>


	<!-- Breadcrumb Begin -->
	<div class="breadcrumb-option">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb__links">
						<a href="./index.html"><i class="fa fa-home"></i> Home</a> <a
							href="./categories.html">Categories</a> <a href="#">Romance</a> <span>${movie.title }</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb End -->

	<!-- Anime Section Begin -->
	<section class="anime-details spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="anime__video__player">
						<iframe width="1000" height="600" src="${movie.video }">
						</iframe>
					</div>

				</div>
			</div>
			<div class="row">
				<div class="col-lg-8">
					<div class="anime__details__review">
						<div class="section-title">
							<h5>Reviews</h5>
						</div>
						<div id="replies"></div>
					</div>
					<div class="anime__details__form">
					<input id="mno" type="hidden" value="${movie.mno}"/>
					<input id="login_name" type="hidden" value="${login.name}"/> 
					<input id="login_email" type="hidden" value="${login.email}"/>
					
						<div class="section-title">
							<h5>Your Comment</h5>
						</div>
						
						<div>
							<input id="mno" type="hidden" value="${movie.mno}"/>
							<input id="login_name" type="hidden" value="${login.name}"/> 
							<input id="login_email" type="hidden" value="${login.email}"/>
							<textarea id="content" placeholder="Your Comment"></textarea>
							<button type="submit" id="submit">
								<i class="fa fa-location-arrow"></i> Review
							</button>
						<div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Anime Section End -->



	<!-- Search model Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">
				<i class="icon_close"></i>
			</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search model end -->


</body>
<script
	src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/resources/js/replies.js?version=03"></script>

</html>