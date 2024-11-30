package com.evela.common_service.mapper;

import com.evela.common_service.base.BaseEntity;
import com.evela.common_service.dto.BaseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

//@Mapper
public interface BaseMapper {
    /*BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "updatedAt", source = "updatedAt")
    @Mapping(target = "createdBy", source = "createdBy")
    @Mapping(target = "updatedBy", source = "updatedBy")
    @Mapping(target = "isActive", source = "isActive")
    BaseDTO toDTO(BaseEntity entity);

    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "updatedAt", source = "updatedAt")
    @Mapping(target = "createdBy", source = "createdBy")
    @Mapping(target = "updatedBy", source = "updatedBy")
    @Mapping(target = "isActive", source = "isActive")
    BaseEntity toEntity(BaseDTO dto);*/
}
