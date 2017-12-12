	function getCode(){
		$("img").attr("src","/verifyCodeServlet?nocache="+Math.random());
	}
	//回车时，默认是登陆  
	function on_return() {
		if (window.event.keyCode == 13) {
			event.returnValue=false;  
			event.cancel = true;
			if (document.all('btnEp') != null) {
				document.all('btnEp').click();
			}
		}
	} 

// 登录
$('#btnEp').click(function() {
	login();
});


function login() {
	var systemName = $('#userName').val();
	var systemPW = $('#userPwd').val();
	var verifyCode = $('#verifyCode').val();

	var tempPath = $("#basePath").val();
	if (systemName == '') {
		$.messager.alert('系统提示', '请输入用户名', 'warning');
		$("img").attr("src",tempPath+"/verifyCodeServlet?nocache="+Math.random());
		return false;
	}
	if (systemPW == '') {
		$.messager.alert('系统提示', '请输入密码', 'warning');
		$("img").attr("src",tempPath+"/verifyCodeServlet?nocache="+Math.random());
		return false;
	}

	var patrn = /^[a-zA-Z0-9]{4}$/;
	if (!patrn.exec(verifyCode)) {
		$.messager.alert('系统提示', '验证码异常', 'warning');
		$("img").attr("src",tempPath+"/verifyCodeServlet?nocache="+Math.random());
		return false;
	}
	$('#myForm').submit();
}

function logout(){
	$.messager.confirm("是否确认退出?", "是否确认退出?", function (r) {  
        if (r) {  
        	$.post(basePath+"logout.html", 
            		function(data) {
        		  	window.location.href=basePath;
        	});
        }  
    });  
	
	
}