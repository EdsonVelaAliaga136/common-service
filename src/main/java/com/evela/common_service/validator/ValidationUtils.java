package com.evela.common_service.validator;

import jakarta.validation.ValidationException;

import java.util.Collection;

public class ValidationUtils {
    public static void validateNotNull(Object obj, String message){
        if (obj== null){
            throw new ValidationException(message);
        }
    }
    public static boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmail(String email) {
        return email != null && email.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}
