package com.evela.common_service.base;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Embeddable
public class AuditMetadata {

    //@CreatedBy
    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdBy;

    //@LastModifiedBy
    @Column(name = "updated_by")
    private String updatedBy;

    //@CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdOn;

    //@LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedOn;

}
