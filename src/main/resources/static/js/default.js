/*
 * 日期格式化
 * val 值
 * row 行对象
 */
function formatterdate(val, row) {
	if (val != null) {
	var date = new Date(val);
	return date.getFullYear() + '-' + (date.getMonth() + 1) + '-'
	+ date.getDate();
	}
}

/*
 * 金额格式化
 * S 金额
 * N 小数位
 */
function fmoney(s, n){
   n = n > 0 && n <= 20 ? n : 2;  
   s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";//更改这里n数也可确定要保留的小数位  
   var l = s.split(".")[0].split("").reverse(),  
   r = s.split(".")[1];  
   t = "";  
   for(i = 0; i < l.length; i++ )  
   {  
      t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");  
   }  
   return t.split("").reverse().join("")  + "." + r.substring(0,2);//保留2位小数  如果要改动 把substring 最后一位数改动就可  
}  

/*
 * 日期区间比较
 * s 开始日期
 * e 结束日期
 * return 
 */
function duibi(s, e) {
    var arr = s.split("-");
    var starttime = new Date(arr[0], arr[1], arr[2]);
    var starttimes = starttime.getTime();
    var arrs = e.split("-");
    var lktime = new Date(arrs[0], arrs[1], arrs[2]);
    var lktimes = lktime.getTime();
    if(starttimes > lktimes) {
        return true;
    }
    else{
    	return false;
    }
}