package com.evela.common_service.mapper;

public interface IModelMapper {
        <D, T> D map (T source, Class<D> destinationType);

}
