package com.evela.common_service.util;

public interface IModelMapper {
        <D, T> D map (T source, Class<D> destinationType);

}
