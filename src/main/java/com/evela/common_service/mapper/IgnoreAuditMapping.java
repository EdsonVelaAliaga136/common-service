package com.evela.common_service.mapper;

import org.mapstruct.Mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Mapping(target = "createdOn", ignore = true)
@Mapping(target = "updatedOn", ignore = true)
@Mapping(target = "createdBy", ignore = true)
@Mapping(target = "updatedBy", ignore = true)
//@Mapping(target = "auditMetadata", ignore = true)
public @interface IgnoreAuditMapping {
}
