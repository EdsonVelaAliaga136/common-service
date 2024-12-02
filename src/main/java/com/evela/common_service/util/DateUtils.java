package com.evela.common_service.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {
    public static final String DEFAULT_PATTERN = "dd/MM/yyyy";
    public static LocalDateTime now(){
        return LocalDateTime.now(ZoneId.of("America/La_Paz"));
    }

    public static LocalDateTime convertToLocalDateTime(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
    public static Date convertToDate(LocalDateTime dateTime){
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}
