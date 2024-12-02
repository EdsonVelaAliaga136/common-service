package com.evela.common_service.mapper;

import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.util.Optional;

public interface MapperUtils {
    @Named("fromOptionalLocalDateTime")
    public static LocalDateTime fromOptionalLocalDateTime(Optional<LocalDateTime> value) {
        return value.orElse(null); // Convierte Optional en LocalDateTime (null si está vacío)
    }

    @Named("toOptionalLocalDateTime")
    public static Optional<LocalDateTime> toOptionalLocalDateTime(LocalDateTime value) {
        return Optional.ofNullable(value); // Convierte LocalDateTime en Optional
    }

    @Named("fromOptionalString")
    public static String fromOptionalString(Optional<String> value) {
        return value.orElse(null); // Convierte Optional en String
    }

    @Named("toOptionalString")
    public static Optional<String> toOptionalString(String value) {
        return Optional.ofNullable(value); // Convierte String en Optional
    }
}
