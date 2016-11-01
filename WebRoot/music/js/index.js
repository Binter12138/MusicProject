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
			$(this).children().children().attr("src","music/images/"+i[index]+".jpg");
		
		});
	
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
			},3000);
		$(this).children(".arrow").stop().fadeOut();
	});
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
			
		});
	}
	timer=setInterval(function(){
		move(true);
	},3000);
	
	//手风琴
	$(".flash .con ul li").click(function(){
		$(this).stop().animate({width:"970px"},500).siblings().stop().animate({width:"46px"},500);
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
		var i=[24,28,47,26,39,40,51,22];
		var c=["李荣浩","薛之谦","花澤香菜","杨宗纬","查理","蕾哈娜","久石譲","张碧晨"];
		var d=["模特","绅士","しえてナウカ、夢みるペチカ","初爱","See You Again","Only Girl","天空之城","It's Love"];
		changing(i);chang(c);changsong(d);
	});
	//内地
	$(".cs2").click(function(){
		var i=[21,22,23,24,25,26,27,28];
		var c=["五月天","张碧晨","范玮琪","李荣浩","庄心妍","杨宗纬","许嵩","薛之谦"];
		var d=["伤信的人别听慢歌","It's Love","最初的梦想","模特","孤单坠爱","初爱","素颜","绅士"];
		changing(i);chang(c);changsong(d);
	});
	//韩国
	$(".cs3").click(function(){
		var i=[29,30,31,32,33,34,35,36];
		var c=["权志龙","胜利","孝琳","현아 (泫雅)","东永裴","宋旻浩","에일리 (Ailee)","백지영 (白智英)"];
		var d=["Crooked","할 말 있어요","Love Like This","안녕","눈,코,입","BODY","Home","총 맞은 것처럼"];
		changing(i);chang(c);changsong(d);
		
	});
	//欧美
	$(".cs4").click(function(){
		var i=[37,38,39,40,41,42,43,44];
		var c=["Tez Cadey","阿黛尔","查理","蕾哈娜","珠儿","Katy Perry","Taylor Swift","Lenka"];
		var d=["Seve","Rolling In The Deep","See You Again","Only Girl","Stand","Rise","Blank Space","Trouble Is a Friend"];
		changing(i);chang(c);changsong(d);
	});
	//日本
	$(".cs5").click(function(){
		var i=[45,46,47,48,49,50,51,52];
		var c=["滨崎步","倉木麻衣","花澤香菜","Dj Okawari","北嶋彻","Aimer","久石譲","Piko-Taro"];
		var d=["MY ALL","Time after time","sweets parade","Sound Of Silence","unravel","Brave Shine","天空之城","Pen Pineapple Apple Pen"];
		changing(i);chang(c);changsong(d);
	});
	//跟换热门歌曲图片
	function changing(i){
		$(".table dt").each(function(index){
			$(this).children().children().attr("src","music/images/"+i[index]+".jpg");
		});
	
	}
	//跟换歌手名
	function chang(c){
		$(".musicsinger").each(function(index){
			$(this).html(c[index]);
		});
	
	}
	//跟换歌曲名
	function changsong(d){
		$(".musicsong").each(function(index){
			$(this).html(d[index]);
		});
	
	}
	$(".table dt").hover(function(){
		$(this).next().css("background","#31c27c");
		$(this).find(".txt").stop().animate({height:"300px"},200);
	},function(){
		$(".table dl:odd>dd").css("background","#333");
		$(".table dl:even>dd").css("background","#000");
		$(this).find(".txt").stop().animate({height:"0px"},200);

	});
	
	$(".table dd").hover(function(){
		$(this).css("background","#31c27c");
	},function(){
		$(".table dl:odd>dd").css("background","#333");
		$(".table dl:even>dd").css("background","#000");
	});
	
	
	
	
});