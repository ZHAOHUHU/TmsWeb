var tabCache = new Object;

$(function () {
    //缓存已打开的tab，再次打开同一个tab时，选中已打开的tab
    $('#tabs').tabs({
        onSelect: function (title, index) {
            tabCache[title] = index;
            var currTab = $('#tabs').tabs('getTab', index);   
            var idstr = currTab[0].id;
            var arrStr = idstr.split("-");
            var aid = arrStr[0];
            var menuIndex = arrStr[1];
            $('.easyui-accordion li div a#'+aid).parent().addClass("selected");
            /*var p = $('#menu').accordion('getSelected');
            if (p){
            	var index = $('#menu').accordion('getPanelIndex', p);
            	if(index != menuIndex) {
            		$('#menu').accordion('unselect', index);
            		$('#menu').accordion('select', menuIndex);
            		$($("#menu").children("div").get(menuIndex)).children("div").click();
            	}
            }*/
            //$('.easyui-accordion li div a#'+aid).parents('.panel-tool').trigger("click");
        },
        onUnselect:function(title, index){
        	if(title != "" && title.length > 0) {
        		$('.easyui-accordion li div').removeClass("selected");
        	}
        },
        onBeforeClose: function (title, index) {
        	$('.easyui-accordion li div').removeClass("selected");
        	return true;
            //return confirm('您确定要关闭“' + title + '”吗？');
        },
        onClose: function (title, index) {
            delete tabCache[title];
        }
    });
});

function addNewTab(title, url) {
    if (tabCache[title] == undefined) {
        if (url == '') return;
        $('#tabs').tabs('add', {
            title: title,
            content: '<iframe width="100%" height="99%" frameborder="0" marginwidth="5" marginheight="5" ' +
                ' allowtransparency="yes" src="' + url + '" ></iframe>',
            closable: true
        });
    } else {
        $('#tabs').tabs('select', parseInt(tabCache[title]));
    }
}