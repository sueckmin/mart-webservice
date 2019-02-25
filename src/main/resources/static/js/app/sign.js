var main = {
    init : function () {
        var _this = this;
        $('#btn-save2').on('click', function () {
            _this.save2();
        });
    },
    save2 : function () {
        var data = {
            uid: $('#uid').val(),
            upw: $('#upw').val(),
            uemail: $('#uemail').val()
        };

        $.ajax({
            type: 'POST',
            url: '/member',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('가입되었습니다.');
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
    }

};

main.init();