package com.evela.common_service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    private LocalDateTime datetime;
    private int statusCode;
    private String message;
    private String path;

        // Constructor manual
    public ErrorResponse(LocalDateTime datetime, int statusCode, String message, String path) {
        this.datetime = datetime;
        this.statusCode = statusCode;
        this.message = message;
        this.path = path;
    }
}
