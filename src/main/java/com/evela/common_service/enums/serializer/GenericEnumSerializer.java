package com.evela.common_service.enums.serializer;

import com.evela.common_service.enums.EnumWithCustomValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class GenericEnumSerializer <E extends Enum<E> & EnumWithCustomValue<T>, T> extends JsonSerializer<E> {
    @Override
    public void serialize(E value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("name", value.name());
        jsonGenerator.writeObjectField("value", value.getValue());
        jsonGenerator.writeStringField("description", value.getDescription());
        jsonGenerator.writeEndObject();
    }
    /*public void serialize(E value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(value.getValue());
    }*/
}
