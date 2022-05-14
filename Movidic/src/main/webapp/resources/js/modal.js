$(document).ready(function() {
    starRating();


    $('#saveBtn').click(function(event) {
        
        insertRating();


})    

    




});


function insertRating() {
    var $star = $(".star-input"),
    $result = $star.find("output>b");

    //별점 0~5
    var mno_val = $('#mno').val();
    var rating_val = $result.text();
    var name_val = $('#login_name').val();

    $.ajax({
        url : 'insertRating/',
        type : 'POST',
        contentType : "application/json; charset=UTF-8",
        data : JSON.stringify({
            mno : mno_val,
            rating : rating_val,
            email : name_val,
        }),
        success : function(result) {
            window.location.reload();
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            alert('서버와의 통신이 원할하지 않습니다.\n다시 시도 해 주십시오.' );
            }
        

    });
    


}

function gradeBtn(){
    // 여기서 ischeck를 통신 email체크 ischeck ==  null or 0 이면 평점을 이미 주셨습니다.
    // email == 체크 
    // 음... 
    var email_val = $('#login_email').val();
    var mno_val = $('#mno').val();
    console.log(email_val);
    console.log(mno_val);
    if(email_val == '') {
        alert('넌 비회원이다 로그인해라');
        return;
    }

    $.ajax({    
        url: 'isCheck/',
        type: 'POST',
        contentType : "application/json; charset=UTF-8",
        data : JSON.stringify({
                email : email_val,
                mno : mno_val,
        }),
        success: function(response) {
            //데이터가 넘어오면 logcheck  완료
            if(response) {
                alert('넌 이미 평점 등록 했다 임마')
            } else {
                $(".gradeModal").css("display", "block");
                
            }
            console.log(response);
            
        },
        error: function(e) {
            alert('통신 실패' + e)
        }

    })

}

function modalClose(){
    $(".gradeModal").css("display", "none");
}

var starRating = function(){
var $star = $(".star-input"),
    $result = $star.find("output>b");
	
  	$(document)
	.on("focusin", ".star-input>.input", 
		function(){
   		 $(this).addClass("focus");
 	})
		 
   	.on("focusout", ".star-input>.input", function(){
    	var $this = $(this);
    	setTimeout(function(){
      		if($this.find(":focus").length === 0){
       			$this.removeClass("focus");
     	 	}
   		}, 100);
 	 })
  
    .on("change", ".star-input :radio", function(){
    	$result.text($(this).next().text());
  	})
    .on("mouseover", ".star-input label", function(){
    	$result.text($(this).text());
    })
    .on("mouseleave", ".star-input>.input", function(){
    	var $checked = $star.find(":checked");
    		if($checked.length === 0){
     	 		$result.text("0");
   		 	} else {
     	 		$result.text($checked.next().text());
    		}
  	});
};
