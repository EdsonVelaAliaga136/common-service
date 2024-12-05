package com.evela.common_service.exception;

public class OptimisticLockException extends jakarta.persistence.OptimisticLockException {
    public OptimisticLockException(String message){
        super(message);
    }
}
