package com.evela.common_service.config;

import com.evela.common_service.enums.Status;
import com.evela.common_service.enums.deserializer.GenericEnumDeserializer;
import com.evela.common_service.enums.serializer.GenericEnumSerializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class JacksonConfig {

    /*@Bean
    public Module CustomEnumModule(){
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Status.class, new GenericEnumDeserializer<>(Status.class));
        module.addSerializer(Status.class, new GenericEnumSerializer<Status, Integer>());
        return module;
    }*/
}
