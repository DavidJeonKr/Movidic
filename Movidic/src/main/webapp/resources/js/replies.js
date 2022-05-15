$(document).ready(function() {
    
    getAllReplies()
    $('#submit').click(function(event) {
        
        insertreplie();

    })

    //댓글 삭제
    $('#replies').on('click', '.reply_delete', function(event) {
        var rno_val = $(this).prevAll('#rno').val();
        var result = confirm('댓글을 삭제하시겠습니까?');
        if(result) {
            $.ajax({
                url: '/movidic/replies/delete/' + rno_val,
                type: 'DELETE',
                headers: {
                    'Content-Type': 'application/json',
                    'X-HTTP-Method-Override': 'DELETE'
                },
                success: function() {
                    // alert(rno_val + '번 댓글 삭제 성공');
                    getAllReplies();
                },
                error: function(e) {
                    // alert(rno_val + '댓글 삭제 실패');
                }

            })
        } else {
            return;
        }

        

    });

    


});

//댓글 추가
function insertreplie() {
    var mno_val = $('#mno').val();
    var content_val = $('#content').val();
    var name_val = $('#login_name').val();
    console.log(mno_val);
    console.log(content_val);
    console.log(name_val);
    $.ajax({
        url : '/movidic/replies/insert',
        type : 'post',
        contentType : "application/json; charset=UTF-8",
        data : JSON.stringify({
            mno : mno_val,
            content : content_val,
            writer : name_val,
        }),
        success : function(result) {
            $('#content').val('');
            // 댓글 목록 전체 수정
            getAllReplies()
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            alert('서버와의 통신이 원할하지 않습니다.\n다시 시도 해 주십시오.' );
            }
    })
    
}
// list += '<h6>'


// 댓글 목록 조회
function getAllReplies() {
    var mno_val = $('#mno').val();
    var name_val = $('#login_name').val();
    $.getJSON('/movidic/replies/all/' + mno_val, function(response){
        //alert('getAllReplies 통신 성공');
        // console.log('getAllReplies 통신 성공');
        
        var list = '';

        $(response).each(function() {
            list += '<div class="anime__review__item">'
            + '<div class="anime__review__item__text">'
            + '<div class="anime_review_item__div_section">'
            + '<h6>'
            + this.writer
            + ' - <span>'
            + timeForToday(this.regdate)
            + '</span>'
            + '</h6>'
            + '<input type="hidden"  id="rno" name="rno" value="'
            + this.rno
            + '"/>';

            if(this.writer == name_val) {
                list += '<button class="reply_delete">삭제</button>';
            };

            list += '</div><p>'
            + this.content
            + '</p>'
            + '</div>'
            + '</div>';
            
            

        });
        $('#replies').html(list);

        

    });
 }
//댓글 작성시간 메서드
 function timeForToday(day) {
    const today = new Date();
    const timeValue = new Date(day);

    const betweenTime = Math.floor((today.getTime() - timeValue.getTime()) / 1000 / 60);
    if (betweenTime < 1) return '방금 전';
    if (betweenTime < 60) {
        return `${betweenTime}분전`;
    }

    const betweenTimeHour = Math.floor(betweenTime / 60);
    if (betweenTimeHour < 24) {
        return `${betweenTimeHour}시간전`;
    }

    const betweenTimeDay = Math.floor(betweenTime / 60 / 24);
    if (betweenTimeDay < 365) {
        return `${betweenTimeDay}일전`
    }
    return `${Math.floor(betweenTimeDay / 365)}년전`;
}
    