package com.evela.common_service.util;

public class StringUtils {
    public static boolean isEmpty(String value){
        return value == null || value.trim().isEmpty();
    }
    public static String capitalize(String value){
        if (isEmpty(value)){
            return value;
        }
        return value.substring(0,1).toUpperCase()+value.substring(1).toLowerCase();
    }
    public static String join(String delimiter, String... values){
        return String.join(delimiter, values);
    }
}
