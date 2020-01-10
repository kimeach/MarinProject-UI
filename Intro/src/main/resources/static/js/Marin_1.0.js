var company = "/marin/"
	
$("#Logo").click(function(){
	location.href= company+"intro";
})

$('.info').click(function(){
	location.href= company+"intro";
})

$('.login').click(function(){
	location.href= company+"/login";
})
			
			$('.header-menu-item').mouseover(function(){
				$(this).animate({
 					fontSize: '20px'
				},"fast")
			}) 
			$('.header-menu-item').mouseout(function(){
				$(this).animate({
 					fontSize: '1em'
				},"fast")
			})
			$('.header-menu-item').click(function(){
				$('#header').animate({
					height : '300'
				},"slow",function(){
					$('.div-box-cover-top').animate({
						right : 2000
					},"slow",function(){
						/*window.setTimeout(window.location.href="./login", 2000);*/
					})
				})
			})
			
$('#login').click(function(){
	$('#header').animate({
		height : '300'
	},"slow",function(){
		$('.div-box-cover-top').animate({
			right : 2000
		},"slow",function(){
			window.location.href="./login"
			/*location.replace("./login")*/
		})
	})
})

/*.div-box-cover-top*/