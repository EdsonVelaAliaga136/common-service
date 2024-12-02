package com.evela.common_service.util;

public interface JwtUtilInterface {
    boolean validateToken(String token);
    String extractUsername(String token);
}
