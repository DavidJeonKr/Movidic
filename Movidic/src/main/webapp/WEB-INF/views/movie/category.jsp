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
							href="./categories.html">Categories</a> <span>Romance</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Breadcrumb End -->

	<!-- Product Section Begin -->
	<section class="product-page spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="product__page__content">
						<div class="product__page__title">
							<div class="row">
								<div class="col-lg-8 col-md-8 col-sm-6">
									<div class="section-title">
										<h4>Romance</h4>
									</div>
								</div>
								<div class="col-lg-4 col-md-4 col-sm-6">
									<div class="product__page__filter">
										<p>장르 :</p>
										<select id="genre">
											<option value="액션">액션</option>
											<option value="사극">사극</option>
											<option value="드라마">드라마</option>
											<option value="판타지">판타지</option>
											<option value="코미디">코미디</option>
										</select>
									</div>
								</div>
							</div>
						</div>
						<div class="row category_movies">

							
						</div>
					</div>
					<ul class="product__pagination">
				
					</ul>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-8">
					<div class="product__sidebar">
						<div class="product__sidebar__view">
							<div class="section-title">
								<h5>Top Views</h5>
							</div>
							<ul class="filter__controls">
								<li class="active" data-filter="*">Day</li>
								<li data-filter=".week">Week</li>
								<li data-filter=".month">Month</li>
								<li data-filter=".years">Years</li>
							</ul>
							<div class="filter__gallery">
								<div class="product__sidebar__view__item set-bg mix day years"
									data-setbg="${pageContext.request.contextPath }/resources/img/sidebar/tv-1.jpg">
									<div class="ep">18 / ?</div>
									<div class="view">
										<i class="fa fa-eye"></i> 9141
									</div>
									<h5>
										<a href="#">Boruto: Naruto next generations</a>
									</h5>
								</div>
								<div class="product__sidebar__view__item set-bg mix month week"
									data-setbg="${pageContext.request.contextPath }/resources/img/sidebar/tv-2.jpg">
									<div class="ep">18 / ?</div>
									<div class="view">
										<i class="fa fa-eye"></i> 9141
									</div>
									<h5>
										<a href="#">The Seven Deadly Sins: Wrath of the Gods</a>
									</h5>
								</div>
								<div class="product__sidebar__view__item set-bg mix week years"
									data-setbg="${pageContext.request.contextPath }/resources/img/sidebar/tv-3.jpg">
									<div class="ep">18 / ?</div>
									<div class="view">
										<i class="fa fa-eye"></i> 9141
									</div>
									<h5>
										<a href="#">Sword art online alicization war of underworld</a>
									</h5>
								</div>
								<div class="product__sidebar__view__item set-bg mix years month"
									data-setbg="${pageContext.request.contextPath }/resources/img/sidebar/tv-4.jpg">
									<div class="ep">18 / ?</div>
									<div class="view">
										<i class="fa fa-eye"></i> 9141
									</div>
									<h5>
										<a href="#">Fate/stay night: Heaven's Feel I. presage
											flower</a>
									</h5>
								</div>
								<div class="product__sidebar__view__item set-bg mix day"
									data-setbg="${pageContext.request.contextPath }/resources/img/sidebar/tv-5.jpg">
									<div class="ep">18 / ?</div>
									<div class="view">
										<i class="fa fa-eye"></i> 9141
									</div>
									<h5>
										<a href="#">Fate stay night unlimited blade works</a>
									</h5>
								</div>
							</div>
						</div>
						<div class="product__sidebar__comment">
							<div class="section-title">
								<h5>New Comment</h5>
							</div>
							<div class="product__sidebar__comment__item">
								<div class="product__sidebar__comment__item__pic">
									<img
										src="${pageContext.request.contextPath }/resources/img/sidebar/comment-1.jpg"
										alt="">
								</div>
								<div class="product__sidebar__comment__item__text">
									<ul>
										<li>Active</li>
										<li>Movie</li>
									</ul>
									<h5>
										<a href="#">The Seven Deadly Sins: Wrath of the Gods</a>
									</h5>
									<span><i class="fa fa-eye"></i> 19.141 Viewes</span>
								</div>
							</div>
							<div class="product__sidebar__comment__item">
								<div class="product__sidebar__comment__item__pic">
									<img
										src="${pageContext.request.contextPath }/resources/img/sidebar/comment-2.jpg"
										alt="">
								</div>
								<div class="product__sidebar__comment__item__text">
									<ul>
										<li>Active</li>
										<li>Movie</li>
									</ul>
									<h5>
										<a href="#">Shirogane Tamashii hen Kouhan sen</a>
									</h5>
									<span><i class="fa fa-eye"></i> 19.141 Viewes</span>
								</div>
							</div>
							<div class="product__sidebar__comment__item">
								<div class="product__sidebar__comment__item__pic">
									<img
										src="${pageContext.request.contextPath }/resources/img/sidebar/comment-3.jpg"
										alt="">
								</div>
								<div class="product__sidebar__comment__item__text">
									<ul>
										<li>Active</li>
										<li>Movie</li>
									</ul>
									<h5>
										<a href="#">Kizumonogatari III: Reiket su-hen</a>
									</h5>
									<span><i class="fa fa-eye"></i> 19.141 Viewes</span>
								</div>
							</div>
							<div class="product__sidebar__comment__item">
								<div class="product__sidebar__comment__item__pic">
									<img
										src="${pageContext.request.contextPath }/resources/img/sidebar/comment-4.jpg"
										alt="">
								</div>
								<div class="product__sidebar__comment__item__text">
									<ul>
										<li>Active</li>
										<li>Movie</li>
									</ul>
									<h5>
										<a href="#">Monogatari Series: Second Season</a>
									</h5>
									<span><i class="fa fa-eye"></i> 19.141 Viewes</span>
								</div>
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
	<script
	src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.min.js"></script>
	<script
	src="${pageContext.request.contextPath }/resources/js/category.js"></script>
</html>