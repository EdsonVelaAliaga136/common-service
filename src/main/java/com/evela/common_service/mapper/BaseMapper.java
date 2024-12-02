package com.evela.common_service.mapper;

import com.evela.common_service.base.BaseEntity;

//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BaseMapper{//<E extends BaseEntity, D extends BaseDTO<?>> {
    /*BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);
    @Mappings({
            @Mapping(target = "createdAt", source = "createdAt", qualifiedByName = "fromOptionalString"),
            @Mapping(target = "updatedAt", source = "updatedAt", qualifiedByName = "fromOptionalLocalDateTime" ),
            @Mapping(target = "createdBy", source = "createdBy", qualifiedByName = "fromOptionalString"),
            @Mapping(target = "updatedBy", source = "updatedBy", qualifiedByName = "fromOptionalLocalDateTime"),
            @Mapping(target = "active", source = "active")
    })
    BaseDTO toDTO(BaseEntity entity);

    @InheritInverseConfiguration
    BaseEntity toEntity(BaseDTO dto);

    // Métodos personalizados para manejar Optional<String>
    @Named("fromOptionalString")
    default String fromOptionalString(Optional<String> value) {
        return value.orElse(null); // Si el Optional está vacío, devolverá null
    }

    @Named("fromOptionalLocalDateTime")
    default LocalDateTime fromOptionalLocalDateTime(Optional<LocalDateTime> value) {
        return value.orElse(null); // Si el Optional está vacío, devolverá null
    }*/
/*
    D toDTO(E entity);
    E toEntity(D dto);*/
}
