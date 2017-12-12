package shenzhen.teamway.tms9000.portal.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {

    private static String to2MD5(String inStr) {
        return DigestUtils.md5Hex(inStr).toUpperCase();
    }

    /**
     * 加密解密算法 执行一次加密，两次解密
     */
    private static String convertMD5(String inStr) {

        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s.toUpperCase();
    }


    public static String string2MD5(String inStr) {
        return convertMD5(to2MD5(inStr));
    }
    public static void main(String[] args) {
		MD5Util.string2MD5("123456");
	}
}