package com.evela.common_service.dto;

import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDTO<ID extends Serializable> implements Serializable{
    //private ID id;  // Identificador genérico que puede ser Long, UUID, String, etc.

    private Long version = 0L; // Esto controla la concurrencia optimista

    private String createdBy;

    private String updatedBy;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Boolean active;

    private boolean isNew(){
        return false;// id == null;
    }
}
