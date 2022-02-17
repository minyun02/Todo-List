var main = {
    init : function(){
        var _this = this;
        var countDown;
        $('#btn-start').on('click', function(){
            _this.start();
        });
        $('#btn-pause').on('click', function(){
            _this.pause();
        });
        $('#btn-reset').on('click', function(){
            _this.reset();
        });
    },
    start : function(){
        var time = $('#time').val();
        countDown = setInterval(function(){
            if(time === 0){
                clearInterval(countDown);
                //휴식 창으로 넘어가기

            }else{
               time--;
               $('#time').val(time);
            }
        }, 500);
    },
    pause : function(){
        clearInterval(countDown);
    },
    reset : function(){
        var timeOnLoad = $('#timeOnLoad').val();
        $('#time').val(timeOnLoad);
    }
}

main.init();