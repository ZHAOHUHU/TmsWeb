<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" xmlns:layout="http://www.ultraq.net.nz/web/thymeleaf/layout">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商户平台</title>
 <%@include file="common.html" %>
<script src="@{/js/updatePwd.js}"></script>

<script type="text/javascript">


</script>
</head>
<body class="easyui-layout">
	<div id="divHeader"
		data-options="region:'north',border:false,href:'redirect.htm?page=header'"></div>
	<div id="divFooter"
		data-options="region:'south',border:false,href:'redirect.htm?page=footer'"></div>
	
	<div data-options="region:'center',border:false,href:'redirect.htm?page=/storeUser/updateStoreUserPassword'">
	</div>
</body>
</html>