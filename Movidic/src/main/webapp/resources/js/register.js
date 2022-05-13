$(document).ready(function() {
    
    
	(function(){
		emailcheck()
	})();
	
	

});

// 중복된 이메일이 있습니다
function emailcheck() {
    // $("#registerForm").submit(function(){
        
        var email_rule =  /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
        $("#email").change(function(event){
			$.ajax({
				url : "check_email/",
				type : "POST",
                dataType: "json",
                contentType : "application/json; charset=UTF-8",
				data : 
					JSON.stringify({
                        email : $("#email").val(),
                    })
				,
				success : function(result) {
                    if(!email_rule.test($("#email").val())){
                        alert("이메일을 형식에 맞게 입력해주세요. ex) 1234@naver.com");
                        $("#email").css("background", "white");
                        return false; 
                    }
					if (result == 1) {
                        // alert("중복된 이메일이 있습니다");
                        $("#email").css("background", "red");
					} else {
                        // alert("중복된 이메일이 없습니다");
                        $("#email").css("background", "green");
					}
				},
                error: function (XMLHttpRequest, textStatus, errorThrown){
                    alert('서버와의 통신이 원할하지 않습니다.\n다시 시도 해 주십시오.' );
                    }

			})
		});
    // })

}