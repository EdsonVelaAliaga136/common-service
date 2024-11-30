package com.evela.common_service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUtils.class);

    public static void logInfo(String message){
        LOGGER.info(message);
    }

    public static void logError(String message, Throwable throwable){
        LOGGER.error(message, throwable);
    }
}
