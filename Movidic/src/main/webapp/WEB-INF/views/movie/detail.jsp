<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
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
                        <a href="./index.html"><i class="fa fa-home"></i> Home</a>
                        <a href="./categories.html">Categories</a>
                        <!-- TODO: 장르 받아서 입력--> 
                        <span>${movie.genre}</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->

    <!-- Anime Section Begin -->
    <section class="anime-details spad">
        <div class="container">
            <div class="anime__details__content">
                <div class="row">
                    <div class="col-lg-3">
<<<<<<< Updated upstream
                        <div class="anime__details__pic set-bg"  data-setbg="${movie.image}">
                            <div class="comment"><i class="fa fa-comments"></i> 코멘트 </div>
                            <div class="view"><i class="fa fa-eye"></i> 조회수 </div>
=======
                        <div class="anime__details__pic set-bg" data-setbg="${movie.image}">
                            <div class="comment"><i class="fa fa-comments"></i> 코멘트</div>
                            <div class="view"><i class="fa fa-eye"></i> 조회수</div>
>>>>>>> Stashed changes
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="anime__details__text">
                            <div class="anime__details__title">
                                <h3>${movie.title}</h3>
                            </div>
                            <div class="anime__details__rating">
                                <div class="rating">
                                    <a href="#"><i class="fa fa-star"></i></a>
                                    <a href="#"><i class="fa fa-star"></i></a>
                                    <a href="#"><i class="fa fa-star"></i></a>
                                    <a href="#"><i class="fa fa-star"></i></a>
                                    <a href="#"><i class="fa fa-star-half-o"></i></a>
                                </div>
                                <span>1.029 Votes</span>
                            </div>
                            <p>${movie.summary}</p>
                            <div class="anime__details__widget">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6">
                                        <ul>
                                            <li><span>장르:</span> ${movie.genre}</li>
                                            <li><span>상영시간:</span> ${movie.duration}</li>
                                            <li><span>관람등급:</span> ${movie.film_ration}</li>
                                        </ul>
                                    </div>
                                    <div class="col-lg-6 col-md-6">
                                        <ul>
                                            <li><span>개봉일:</span> ${movie.openData}</li>
                                            <li><span>평점:</span> 7.31 / 1,515</li>
                                            <li><span>조회수:</span> 8.5 / 161 times</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="anime__details__btn">
                                <a href="#" class="follow-btn"><i class="fa fa-heart-o"></i> Follow</a>
                                <a href="#" class="watch-btn"><span>Watch Now</span> <i
                                    class="fa fa-angle-right"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8 col-md-8">
                        <div class="anime__details__review">
                            <div class="section-title">
                                <h5>Reviews</h5>
                            </div>
                            <div class="anime__review__item">
                                <div class="anime__review__item__text">
                                    <h6>사용자 이름(name) - <span>1 Hour ago(regdate)</span></h6>
                                    <p>댓글 내용(content)</p>
                                </div>
                            </div>
                            <div class="anime__review__item">
                                <div class="anime__review__item__text">
                                    <h6>Lewis Mann - <span>5 Hour ago</span></h6>
                                    <p>Finally it came out ages ago</p>
                                </div>
                            </div>
                            <div class="anime__review__item">
                                <div class="anime__review__item__text">
                                    <h6>Louis Tyler - <span>20 Hour ago</span></h6>
                                    <p>Where is the episode 15 ? Slow update! Tch</p>
                                </div>
                            </div>
                        </div>
                        
                        <!-- 댓글 입력 -->
                        <div class="anime__details__form">
                            <div class="section-title">
                                <h5>Your Comment</h5>
                            </div>
                            <div>
                            	<input id="mno" type="hidden" value="${movie.mno}">
                            	<input id="login_name" type="hidden" value="${login.name}">
                                <textarea id="content" placeholder="Your Comment">${login.name}</textarea>
                                <button type="submit" id="submit"><i class="fa fa-location-arrow"></i> Review</button>
                            </div>
                        </div>
                    </div>
                    
                    <!-- TODO 장르에 맞는 것을 검색 예) -> like 액션 등등  -->
                    <div class="col-lg-4 col-md-4">
                        <div class="anime__details__sidebar">
                            <div class="section-title">
                                <h5>you might like...</h5>
                            </div>
                            <div class="filter__gallery">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Anime Section End -->

    

          <!-- Search model Begin -->
          <div class="search-model">
            <div class="h-100 d-flex align-items-center justify-content-center">
                <div class="search-close-switch"><i class="icon_close"></i></div>
                <form class="search-model-form">
                    <input type="text" id="search-input" placeholder="Search here.....">
                </form>
            </div>
        </div>
        <!-- Search model end -->


    </body>

    
    <script
	src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.min.js"></script>
	<script src="${pageContext.request.contextPath }/resources/js/category.js"></script>
	<script src="${pageContext.request.contextPath }/resources/js/replies.js"> </script>

    </html>