$(function(){
	

	$(".passwords").blur(function(){
		
		if(($(".passwords").val())==""){
			$("#errorpassword").text("密码不能为空");
		}
		else if(($(".passwords").val()).length<3 || ($(".passwords").val()).length>16)
			{
				$("#errorpassword").text("密码长度错误应该在3~16之间");
			}
		else{
			$("#errorpassword").html("<img src='music/images/dagou.png'/>");
		}
		
			
	});

	$(".psw").blur(function(){
		if(($(".psw").val())=="")
			{
			
			$("#errorrepassword").text("确认密码不能为空!");
			}
		
		else if(($(".passwords").val())==($(".psw").val())){
			$(".mtis").html("<img src='music/images/dagou.png'/>");
		}else{
			$("#errorrepassword").text("密码输入不一致!");
		};
			
	});
	var k=1;
	for(var i=1969;i<2017;i++){
		$("#yy").append("<option value='"+k+"'>"+i+"年</option>");
		k++;
	}
	$("#yy").click(function(){
		$("#mm option").remove();
		$("#mm").append("<option value='0'>选择 月</option>");
		for(var i=1;i<=12;i++){
			$("#mm").append("<option value='"+i+"'>"+i+"月</option>");
		}
	});
	var day=[31,28,31,30,31,30,31,31,30,31,30,31];
	var rday=[31,29,31,30,31,30,31,31,30,31,30,31];
	$("#mm").click(function(){
		$("#dd option").remove();
		$("#dd").append("<option value='0'>选择 日</option>");
		var year=$("#yy").val();
		var index=$("#mm").val();
		if((year%4==0)&&(year%400==0)||(year%100!==0)){
			if(index>0&&index<12){
				for(var i=1;i<=rday[index-1];i++){
					$("#dd").append("<option value='"+i+"'>"+i+"日</option>");
				}
			}
		}else{
			if(index>0&&index<12){
				for(var i=1;i<=day[index-1];i++){
					$("#dd").append("<option value='"+i+"'>"+i+"日</option>");
				}
			}
		}
	});
});