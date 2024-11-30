package com.evela.common_service.util;

import jakarta.validation.ValidationException;

public class ValidationUtils {
    public static void validateNotNull(Object obj, String message){
        if (obj== null){
            throw new ValidationException(message);
        }
    }
}
