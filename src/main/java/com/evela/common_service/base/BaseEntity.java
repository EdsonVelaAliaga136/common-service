package com.evela.common_service.base;

import com.evela.common_service.audit.CustomAuditorAware;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable{//} implements Auditable<String, Long, LocalDateTime>, Serializable {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    //private Long id;

    @Version
    @Column(name = "version")
    private Long version; // Esto controla la concurrencia optimista

    @CreatedBy
    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    private String updatedBy;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "active")
    private Boolean active;//base = true;

    /*@Autowired
    private CustomAuditorAware auditorAware;*/
    /*
    @PrePersist
    protected void onCreated(){
        createdAt=LocalDateTime.now();
        //createdBy=auditorAware.getCurrentAuditor().orElse("unknow");
        //createdBy=getCurrentAuditor().orElse("unknow");
    }

    @PreUpdate
    protected void onUpdated(){
        updatedAt=LocalDateTime.now();
        //updatedBy=auditorAware.getCurrentAuditor().orElse("unknow");
        //updatedBy=getCurrentAuditor().orElse("unknow");
    }
    */
    /*private Optional<String> getCurrentAuditor(){
        return new CustomAuditorAware().getCurrentAuditor();
    }*/
}
