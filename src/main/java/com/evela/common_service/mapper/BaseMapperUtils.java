package com.evela.common_service.mapper;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class BaseMapperUtils {
    @Named("fromOptionalString")
    public String fromOptionalString(Optional<String> value) {
        return value.orElse(null);
    }


    @Named("fromOptionalLocalDateTime")
    public LocalDateTime fromOptionalLocalDateTime(Optional<LocalDateTime> value) {
        return value.orElse(null);
    }


    @Named("toOptionalLocalDateTime")
    public Optional<LocalDateTime> toOptionalLocalDateTime(LocalDateTime value) {
        return Optional.ofNullable(value);
    }

    @Named("toOptionalString")
    public Optional<String> toOptionalString(String value) {
        return Optional.ofNullable(value);
    }
}
