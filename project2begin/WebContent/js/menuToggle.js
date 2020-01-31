$(function() {

	var flag=true;

	$("#menuToggle").on("click", function(){
		if(flag==true){
			$(".sideNav").fadeOut();
			$(".main").css({
				marginLeft:0
			})
			flag=false;
		} else {
			$(".sideNav").fadeIn();
			$(".main").css({
				marginLeft:"250px"
			})
			flag=true;
		}
	})
	
});

	