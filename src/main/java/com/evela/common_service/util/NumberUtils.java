package com.evela.common_service.util;

public class NumberUtils {
    public static boolean isPositive(Integer number){
        return number!=null && number>0;
    }
    public static boolean isNegative(Integer number){
        return number!=null && number<0;
    }
    public static Integer parseInt(String value, Integer defaultValue){
        try {
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            return defaultValue;
        }
    }
}
