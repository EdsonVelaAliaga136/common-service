package com.evela.common_service.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String toJson(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        }catch (JsonProcessingException e){
            throw new RuntimeException("Error al convertir a JSON ", e);
        }
    }

    public static <T> T fromJson(String json, Class<T> clazz){
        try {
            return objectMapper.readValue(json, clazz);
        }catch (JsonProcessingException e){
            throw new RuntimeException("Error al convertir desde JSON ", e);
        }
    }
}
