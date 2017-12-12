/**
 * 公共工具类
 */

var Utils = {};

Utils.getPhotoSize=function(obj){
	var file = $("#"+obj.id) ;
    photoExt=obj.value.substr(obj.value.lastIndexOf(".")).toLowerCase();//获得文件后缀名
    if(photoExt!='.jpg'&&photoExt!=".jpge"&&photoExt!=".gif"&&photoExt!=".bmp"){
        alert("请上传后缀名为jpg,jpge,gif,.bmp的照片!");
       
        file.after(file.clone().val(""));   
        file.remove();   
        return false;
    }
    var fileSize = 0;
    var isIE = /msie/i.test(navigator.userAgent) && !window.opera;            
    if (isIE && !obj.files) {          
         var filePath = obj.value;            
         var fileSystem = new ActiveXObject("Scripting.FileSystemObject");   
         var file = fileSystem.GetFile (filePath);               
         fileSize = file.Size;         
    }else {  
         fileSize = obj.files[0].size;     
    } 
    fileSize=Math.round(fileSize/1024*100)/100; //单位为KB
    if(fileSize>=2048){
        alert("照片最大尺寸为2M，请重新上传!");
        file.after(file.clone().val(""));   
        file.remove();   
        return false;
    }
}


function dateCompare(startdate, enddate) {
    var arr = startdate.split("-");
    var starttime = new Date(arr[0], arr[1], arr[2]);
    var starttimes = starttime.getTime();

    var arrs = enddate.split("-");
    var lktime = new Date(arrs[0], arrs[1], arrs[2]);
    var lktimes = lktime.getTime();

    if (starttimes > lktimes) {
        return false;
    }
    else
        return true;
}



/**
 * 获取时间戳
 */
Utils.getTimestamp = function(){
	var timestamp=new Date().getTime();
	return timestamp;
}
