package com.evela.common_service.base;

import com.evela.common_service.audit.Auditable;
import com.evela.common_service.context.AuditContext;
import com.evela.common_service.util.LoggerUtils;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public class AuditListener {
    @PrePersist
    public void setCreatedOn(Auditable auditable){
        AuditMetadata auditMetadata = auditable.getAuditMetadata();
        if (auditMetadata == null){
            auditMetadata = new AuditMetadata();
            auditable.setAuditMetadata(auditMetadata);
        }
        auditMetadata.setCreatedOn(LocalDateTime.now());
        auditMetadata.setCreatedBy(AuditContext.getCurrentUser());
    }

    @PreUpdate
    public void setUpdatedOn(Auditable auditable){
        AuditMetadata auditMetadata = auditable.getAuditMetadata();
        auditMetadata.setUpdatedOn(LocalDateTime.now());
        auditMetadata.setUpdatedBy(AuditContext.getCurrentUser());
    }
}
