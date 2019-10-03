//Go to top
$(function () {

			var scroll_timer;
			var displayed = false;
			var $message = $('#message');
			var $window = $(window);
			var top = $(document.body).children(0).position().top;

			$window.scroll(function () {
				window.clearTimeout(scroll_timer);
				scroll_timer = window.setTimeout(function () {
					if($window.scrollTop() <= top) 
					{
						displayed = false;
						$message.fadeOut(500);
					}
					else if(displayed == false) 
					{
						displayed = true;
						$message.stop(true, true).fadeIn(500).click(function () { $message.fadeOut(500); });
					}
				}, 100);
			});
			$('#top-link').click(function(e) { 
				e.preventDefault();
				$.scrollTo(0,300); 
			   });
		});
		
		
		
//Tipsy
		
$(function() {

    $('.north').tipsy({gravity: 'n'});
    
});


//Contact Form Box
  
  $(document).ready(function(){
  				$("a[rel='gallery']").colorbox();
				$("#contact").colorbox({width:"500", height:"580", iframe:true});
			});