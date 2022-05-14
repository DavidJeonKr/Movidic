$(document).ready(function() {
    
    $('#submit').click(function(event) {
        
        
        insertreplie();
        



        



        
    })


});

function insertreplie() {
    var mno_val = $('#mno').val();
    var content_val = $('#content').val();
    var name_val = $('#login_name').val();
    console.log(mno_val);
    console.log(content_val);
    console.log(name_val);
    $.ajax({
        url : '/movidic/replies/all/' + mno_val,
        type : 'post',
        contentType : "application/json; charset=UTF-8",
        data : JSON.stringify({
            mno : mno_val,
            content : content_val,
            writer : name_val,
        }),
        success : function(result) {
            console.log(result);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
        	console.log(XMLHttpRequest);
        	console.log(textStatus);
        	console.log(errorThrown);
            alert('서버와의 통신이 원할하지 않습니다.\n다시 시도 해 주십시오.' );
            }
    })
    
}