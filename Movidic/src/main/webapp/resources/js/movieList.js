$(document).ready(function() {

console.log("시작 안했나");
	(function(){
		getRankData()
	})();
    



function getRankData(){

	$.ajax({
	type:"get",
	url:"movie/getRankData/",
	dataType: "json",
	contentType : "application/json; charset=UTF-8",
	success : function(data) {
	console.log(data);
		enterData(data);
	},
	error : function(error) {
			console.log(error);
		}
	
	})
};

}) 
function enterData(data){
	var strAdd= "";
	console.log("엔터데이터");
	
	$.each(data.list, function(i,el){
		strAdd+='<div class="col-lg-4 col-md-6 col-sm-6">';
		strAdd+='<a href="movie/detail?mno' + el.mno + '">';
		strAdd+='<div class="product__item">';
		strAdd+='<div class="product__item__pic set-bg" data-setbg="'+el.image+'" style="background-image:url('+el.image+');">';
		strAdd+='<div class="comment">';
		strAdd+='<i class="fa fa-comments"></i> 11';
		strAdd+='</div>';
		strAdd+='<div class="view">';
		strAdd+='<i class="fa fa-eye"></i> 9141';
		strAdd+='</div>';
		strAdd+='</div>';
		strAdd+='<div class="product__item__text">';
		strAdd+='<ul>';
		strAdd+='<li>Active</li>';
		strAdd+='<li>Movie</li>';
		strAdd+='</ul>';
		strAdd+='<h5>';
		strAdd+='The Seven Deadly Sins: Wrath of the Gods';
		strAdd+='</h5>';
		strAdd+='</div>';
		strAdd+='</div>';
		strAdd+='</a>';
		strAdd+='</div>';
		})
		$(".rank_movies").html(strAdd);
}