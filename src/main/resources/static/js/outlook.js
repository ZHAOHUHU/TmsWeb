var _menus;
var basePath;

$(document).ready(function(){
	basePath  =$("#basePath").val()+"/";
	outLookInit();
});

function outLookInit(){
	
	// 从后台取导航信息
	$.ajax({
		type : 'post',
		dataType : 'html',
		url : basePath+"merchantUserMenus.htm", 
		success:function(data) {
			_menus = eval("(" + data + ")");//转换为json对象
			InitLeftMenu();
		}
	});
	
}

// 初始化左侧
function InitLeftMenu() {

	$(".easyui-accordion").empty();
	var menulist = "";
	
	 $.each(_menus, function(i, sm) {
	        var menulist = "";
	        menulist += '<ul>';
	        $.each(sm.menuList, function(j, o) {
	            menulist += '<li><div><a id="' + o.menuId + '"  ref="' + i + '" href="javascript:void(0);" rel="'
	                    + basePath+o.menuUrl + '" ><span class="icon' + '-blank'
	                    + '" >&nbsp;</span><span class="nav">' + o.menuName
	                    + '</span></a></div></li> ';
	        });
	        menulist += '</ul>';

	        $('#menu').accordion('add', {
	            title : sm.menuName,
	            content : menulist,
	            iconCls : 'icon-blank'
	        });

	    });

	   /* var pp = $('#menu').accordion('panels');
	    var t = pp[0].panel('options').title;
	    $('#menu').accordion('select', t);*/


	$(".easyui-accordion").append(menulist);
	$('.easyui-accordion li a').click(function() {
		var tabTitle = $(this).text();
		var url = $(this).attr("rel");
		var id = $(this).attr("id");
		var ref = $(this).attr("ref");
		addTab(tabTitle, url,id,ref);
		$('.easyui-accordion li div').removeClass("selected");
		$(this).parent().addClass("selected");
	}).hover(function() {
		$(this).parent().addClass("hover");
	}, function() {
		$(this).parent().removeClass("hover");
	});

	$(".easyui-accordion").accordion();
}
function addTab(subtitle, url,id,ref) {
	if (!$('#tabs').tabs('exists', subtitle)) {
		$('#tabs').tabs('add', {
			id:id+"-"+ref,
			title : subtitle,
			content : createFrame(subtitle, url),			
			closable : true,
			width : $('#mainPanle').width() - 10,
			height : $('#mainPanle').height() - 26
			
		});
	} else {
		$('#tabs').tabs('select', subtitle);
		refreshTab({tabTitle:subtitle,url:url});
	}
}
function createFrame(subtitle, url) {
	var s = '<iframe name="' + subtitle + '" scrolling="yes" frameborder="0"  src="'+url+'" style="padding:32px 0 0 32px;width:1660px;height:760px;"></iframe>';
	return s;
}
function refreshTab(cfg){  
    var refresh_tab = cfg.tabTitle?$('#tabs').tabs('getTab',cfg.tabTitle):$('#tabs').tabs('getSelected');  
    if(refresh_tab && refresh_tab.find('iframe').length > 0){  
    var _refresh_ifram = refresh_tab.find('iframe')[0];  
    var refresh_url = cfg.url?cfg.url:_refresh_ifram.src;  
    _refresh_ifram.contentWindow.location.href=refresh_url;  
    }  
} 
