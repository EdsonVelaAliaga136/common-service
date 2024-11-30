package com.evela.common_service.util;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateUtils {
    public static LocalDateTime now(){
        return LocalDateTime.now(ZoneId.of("America/La_Paz"));
    }
}
