$(function(){
	$(".choose li>a").hover(function() {
			$(this).css("font-weight","900");
		}, function() {
			$(this).css("font-weight","");
	});
	$(".choose li>a").click(function() {
		$("#plate1 ul").children().children().css("color","gray");
		$(this).css("color","white");
	});
	$(".choose1").click(function(){
		var i=[6,8,10,16,11];
		choose(i);
	});
	$(".choose2").click(function(){
		var i=[5,4,3,2,1];
		choose(i);
	});
	$(".choose3").click(function(){
		var i=[10,9,8,7,6];
		choose(i);
	});
	$(".choose4").click(function(){
		var i=[15,14,13,12,11];
		choose(i);
	});
	$(".choose5").click(function(){
		var i=[20,19,18,17,16];
		choose(i);
	});
	function choose(i){
		$(".slide li").each(function(index){
			$(this).children().children().attr("src","images/"+i[index]+".png")
		
		})
	
	}
	
	
	//木马
	var slide = $(".slide");
	var lis = slide.find("li");
	slide.hover(function(){
			clearInterval(timer);
			$(this).children(".arrow").stop().fadeIn();

		},function(){
		
			clearInterval(timer);
			timer = setInterval(function(){
				move(true);
			},3000)
		$(this).children(".arrow").stop().fadeOut();
	})
	var json =[
	{
		width:400,//1
		top:70,
		left:50,
		opacity:0.4,
		z:2

	},{
		width:600,//2
		top:120,
		left:0,
		opacity:0.8,
		z:3

	},{
		width:800,//3
		top:50,
		left:200,
		opacity:1,
		z:4

	},{
		width:600,//4
		top:120,
		left:600,
		opacity:0.8,
		z:3

	},{
		width:400,//5
		top:70,
		left:750,
		opacity:0.4,
		z:2

	}];
	
	move();
	
	var flag = true;
	$(".prev").click(function(){
		if(flag==true){
			move(false);
			flag=false;
		}
	});
	$(".next").click(function(){
		if(flag==true){
			move(true);
			flag=false;
		}
		
	});
	function move(obj){
		if(obj!=undefined){
			if(obj){
				json.unshift(json.pop());
				
			}else{
				json.push(json.shift());
				

			}
		}
		$.each(json,function(i,value){
			
			lis.eq(i).css("zIndex",json[i].z).stop().animate(value,function(){flag=true});
			
		})
	}
	timer=setInterval(function(){
		move(true);
	},3000);
	
	//手风琴
	$(".flash .con ul li").click(function(){
		$(this).stop().animate({width:"970px"},500).siblings().stop().animate({width:"46px"},500)
	});
	
	//表格
	$(".cs li>a").hover(function() {
			$(this).css("font-weight","900");
		}, function() {
			$(this).css("font-weight","");
	});
	
	$(".cs li>a").click(function() {
		$(".cs ul").children().children().css("color","black");
		$(this).css("color","#31c27c");
	});
	
	
	$(".cs1").click(function(){
		var i=[5,6,7,8,9,10,11,12];
		changing(i);
	});
	$(".cs2").click(function(){
		var i=[1,2,3,4,5,6,7,8];
		changing(i);
	});
	$(".cs3").click(function(){
		var i=[3,6,2,8,9,10,15,13];
		changing(i);
	});
	$(".cs4").click(function(){
		var i=[14,15,16,17,18,19,20,21];
		changing(i);
	});
	$(".cs5").click(function(){
		var i=[14,16,18,5,7,9,1,2];
		changing(i);
	});
	
	function changing(i){
		$(".table dt").each(function(index){
			$(this).children().children().attr("src","images/"+i[index]+".png");
		})
	
	}
	$(".table dt").hover(function(){
		$(this).next().css("background","#31c27c");
		$(this).find(".txt").stop().animate({height:"300px"},200);
	},function(){
		$(".table dl:odd>dd").css("background","#333");
		$(".table dl:even>dd").css("background","#000");
		$(this).find(".txt").stop().animate({height:"0px"},200);

	})
	
	$(".table dd").hover(function(){
		$(this).css("background","#31c27c");
	},function(){
		$(".table dl:odd>dd").css("background","#333");
		$(".table dl:even>dd").css("background","#000");
	})
	
	
	
	
})