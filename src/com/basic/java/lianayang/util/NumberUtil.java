package com.basic.java.lianayang.util;


/**
 * @author YangLanhuizi
 * @date 2022/10/26 - 9:25 PM
 */
public class NumberUtil {

    public static boolean isPositiveInteger(String str){
        return str.matches("^[0-9]*[1-9][0-9]*$");
    }

    public static boolean isNonNegativeInteger(String str){
        return str.matches("^[0-9]+[0-9]*$");
    }


}
