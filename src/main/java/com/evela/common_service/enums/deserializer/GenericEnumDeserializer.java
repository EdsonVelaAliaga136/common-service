package com.evela.common_service.enums.deserializer;

import com.evela.common_service.enums.EnumWithCustomValue;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;


public class GenericEnumDeserializer <E extends Enum<E> & EnumWithCustomValue<T>, T> extends JsonDeserializer<E> {
    private Class<E> enumClass;

    public GenericEnumDeserializer(Class<E> enumClass) {
        this.enumClass = enumClass;
    }

    public GenericEnumDeserializer() {
        // Constructor vacío requerido por Jackson
    }

    @Override
    public E deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        /*if (enumClass==null){
            enumClass = (Class<E>) deserializationContext.getContextualType().getRawClass();
        }*/
        T value = (T) jsonParser.getNumberValue();
        return Arrays.stream(enumClass.getEnumConstants())
                .filter(e->e.getValue().equals(value))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Invalid value: " + value));
    }
}
