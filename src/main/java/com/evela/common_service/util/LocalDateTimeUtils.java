package com.evela.common_service.util;

import java.time.LocalDateTime;

public class LocalDateTimeUtils {
    public static boolean isBeforeNow(LocalDateTime dateTime){
        return dateTime.isBefore(LocalDateTime.now());
    }

    public static boolean isAfterNow(LocalDateTime dateTime){
        return dateTime.isAfter(LocalDateTime.now());
    }

    public static LocalDateTime addDays(LocalDateTime dateTime, int days){
        return dateTime.plusDays(days);
    }

    public static LocalDateTime subtractDays(LocalDateTime dateTime, int days){
        return dateTime.minusDays(days);
    }
}
