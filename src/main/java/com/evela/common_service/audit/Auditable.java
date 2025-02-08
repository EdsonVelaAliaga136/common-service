package com.evela.common_service.audit;

import com.evela.common_service.base.AuditMetadata;

public interface Auditable {
    AuditMetadata getAuditMetadata();
    void setAuditMetadata(AuditMetadata auditMetadata);
}
