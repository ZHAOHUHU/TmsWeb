

function openUpdatePwd() {
	window.open(basePath+"/store/initStorePassword.htm",'更改密码','height=400,width=800,top=200,left=200,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no');
}
function openMyInfo() {
	window.open(basePath+"/store/initMyInfo.htm",'我的个人信息','height=400,width=800,top=200,left=200,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no');
}
function updatePwd(){
//	var currentPwd = $('#currentPwd').val();
	var password = $('#password').val();
	var comfirmPwd = $('#comfirmPwd').val();

/* 	if (currentPwd == '') {
		$.messager.alert('系统提示', '请输入当前密码', 'warning');
		return false;
	} */
	if (password == '') {
		$.messager.alert('系统提示', '请输入新密码', 'warning');
		return false;
	}

	var reg = /^[a-zA-Z0-9]*(([a-zA-Z]+\d+)+|(\d+[a-zA-Z]+)+)[a-zA-Z0-9]*$/;
	if(!password.match(reg)){
		$.messager.alert('系统提示', '密码位数6-20位英文和数字', 'warning');
		return false;
	}
	
	if(password.length < 6){
		$.messager.alert('系统提示', '密码位数6-20位英文和数字', 'warning');
		return false;
	}
	
	if (comfirmPwd == '') {
		$.messager.alert('系统提示', '请输入确认密码', 'warning');
		return false;
	}

	if (comfirmPwd != password) {
		$.messager.alert('系统提示', '两次输入的密码不一致', 'warning');
		return false;
	}
	$("#myForm").submit();
}

function windowClose(){
	 window.close();
}


function mergePws() {

	var password = $('#password').val();
	var comfirmPwd = $('#comfirmPwd').val();

	if (password == '') {
		$.messager.alert('系统提示', '请输入新密码', 'warning');
		return false;
	}
	var reg = /^[a-zA-Z0-9]*(([a-zA-Z]+\d+)+|(\d+[a-zA-Z]+)+)[a-zA-Z0-9]*$/;
	if(!password.match(reg)){
		$.messager.alert('系统提示', '密码位数6-20位英文和数字', 'warning');
		return false;
	}
	
	if(password.length < 6){
		$.messager.alert('系统提示', '密码位数6-20位英文和数字', 'warning');
		return false;
	}
	
	if (comfirmPwd == '') {
		$.messager.alert('系统提示', '请输入确认密码', 'warning');
		return false;
	}

	if (comfirmPwd != password) {
		$.messager.alert('系统提示', '两次输入的密码不一致', 'warning');
		return false;
	}
	
 	$.ajax({
     type: "POST",
     url: basePath+"/store/mergePassword.htm",
		async : false,
		data : $('#myForm').serialize(),
		success : function(data) {

			 window.close();
		}
	});
}