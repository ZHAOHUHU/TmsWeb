
    function exportData(grid,rows,webProjectUrl,exportName){
		var tableString = '<table cellspacing="0" border="1">';  
   		var columns = grid.datagrid("options").columns;    // 得到columns对象  
    	var nameList = new Array();  
    	// 载入title  
        if (typeof columns != 'undefined' && columns != '') {  
            $(columns).each(function (index) {  
                tableString += '\n<tr>';
                for (var i = 0; i < columns[index].length; ++i) {  
                    if (!columns[index][i].hidden && columns[index][i].field != 'operator') {  
                        tableString += '\n<th width="' + columns[index][i].width + '"';  
                        if (typeof columns[index][i].rowspan != 'undefined' && columns[index][i].rowspan > 1) {  
                            tableString += ' rowspan="' + columns[index][i].rowspan + '"';  
                        }  
                        if (typeof columns[index][i].colspan != 'undefined' && columns[index][i].colspan > 1) {  
                            tableString += ' colspan="' + columns[index][i].colspan + '"';  
                        }  
                        if (typeof columns[index][i].field != 'undefined' && columns[index][i].field != '') {  
                            nameList.push(columns[index][i]);  
                        }  
                        tableString += '>' + columns[index][i].title + '</th>';  
                    }  
                }  
                tableString += '\n</tr>';  
            });  
        }  
    
    // 载入内容  
    var len = rows.length;
    for (var i = 0; i < len; ++i) {  
        tableString += '\n<tr>';  
        for (var j = 0; j < nameList.length; ++j) {  
            var e = nameList[j].field.lastIndexOf('_0');  
  
            tableString += '\n<td';  
            if (nameList[j].align != 'undefined' && nameList[j].align != '') {  
                tableString += ' style="text-align:' + nameList[j].align + ';"';  
            }  
            tableString += '>';  
            if (e + 2 == nameList[j].field.length) {  
                tableString += rows[i][nameList[j].field.substring(0, e)];  
            }  
            else  
                tableString += rows[i][nameList[j].field];  
            tableString += '</td>';  
        }  
        tableString += '\n</tr>';  
    }  
    tableString += '\n</table>'; 
    exportString=tableString;
    var url=webProjectUrl+"/export/initExport.htm?exportName="+exportName;
    var iframe={
			doSize:false,
			shadow:false,
			content:'<iframe  scrolling="no" frameborder="0"  src="'+url+'" style="width:100%;height:95%;"></iframe>',
			title:'数据导出',
		    width:300,    
		    height:170,
		    modal:true   	
	};
    
    $("body").append("<div id='export'></div>");
    $('#export').dialog(iframe);
	$('#export').window('center');
} 