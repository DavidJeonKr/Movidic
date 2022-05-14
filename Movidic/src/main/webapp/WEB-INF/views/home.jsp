<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Anime Template">
<meta name="keywords" content="Anime, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Movidic</title>


</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>




	<!-- Hero Section Begin -->
	<section class="hero">
		<div class="container">
			<div class="hero__slider owl-carousel">
			<c:forEach var="data" items="${sliderData }">
				<a href="movie/detail?mno=${data.mno }">
				</a>
				<div class="hero__items set-bg" data-setbg="${data.image }">
					<div class="row">
						<div class="col-lg-6">
							<div class="hero__text">
								<div class="label">${data.genre }</div>
								<h2>${data.title }</h2>
								<p>${data.summary }</p>
								<a href="#"><span>Watch Now</span> <i class="fa fa-angle-right"></i></a>
							</div>
						</div>
					</div>
				</div>
				
				
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- Hero Section End -->

	<!-- Product Section Begin -->
	<section class="product spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="trending__product">
						<div class="row">
							<div class="col-lg-8 col-md-8 col-sm-8">
								<div class="section-title">
									<h4>Trending Now</h4>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-4">
								<div class="btn__all">
									<a href="#" class="primary-btn">View All <span
										class="arrow_right"></span></a>
								</div>
							</div>
						</div>
						<div class="row rank_movies">
							
						</div>
					</div>
					<div class="popular__product">
						<div class="row">
							<div class="col-lg-8 col-md-8 col-sm-8">
								<div class="section-title">
									<h4>Popular Shows</h4>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-4">
								<div class="btn__all">
									<a href="#" class="primary-btn">View All <span
										class="arrow_right"></span></a>
								</div>
							</div>
						</div>
						<div class="row trending_movies">
						
						</div>
					</div>
					<div class="recent__product">
						<div class="row">
							<div class="col-lg-8 col-md-8 col-sm-8">
								<div class="section-title">
									<h4>Recently Added Shows</h4>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-4">
								<div class="btn__all">
									<a href="#" class="primary-btn">View All <span
										class="arrow_right"></span></a>
								</div>
							</div>
						</div>
						<div class="row lately_movies">
							
						</div>
					</div>

				</div>
				<div class="col-lg-4 col-md-6 col-sm-8">
					<div class="product__sidebar">
						<div class="product__sidebar__view">
							<div class="section-title">
								<h5>Top Views</h5>
							</div>

							<div class="filter__gallery">

							</div>
						</div>
						<div class="product__sidebar__comment">
							<div class="section-title">
								<h5>New Comment</h5>
							</div>
							<div class="recentReplie">

							</div>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Product Section End -->

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


<script>
	var msg = "${msg}";
	if (msg != "") {
		alert(msg);
	}
</script>

	<script
	src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.min.js"></script>
	<script
	src="${pageContext.request.contextPath }/resources/js/movieList.js"></script>
</html>