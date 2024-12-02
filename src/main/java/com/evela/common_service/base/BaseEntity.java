package com.evela.common_service.base;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable{//} implements Auditable<String, Long, LocalDateTime>, Serializable {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id;

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

    @Column(nullable = false)
    private Boolean active = true;
/*
    //@Override
    @NonNull
    public Optional<String> getCreatedBy() {
        return Optional.ofNullable(createdBy);
    }

    @Override
    @NonNull
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    @NonNull
    public Optional<LocalDateTime> getCreatedDate() {
        return Optional.ofNullable(createdAt);
    }

    @Override
    @NonNull
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdAt = createdDate;
    }

    @Override
    @NonNull
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(updatedBy);
    }

    @Override
    @NonNull
    public void setLastModifiedBy(String lastModifiedBy) {
        this.updatedBy = lastModifiedBy;
    }

    @Override
    @NonNull
    public Optional<LocalDateTime> getLastModifiedDate() {
        return Optional.ofNullable(updatedAt);
    }

    @Override
    @NonNull
    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.updatedAt = lastModifiedDate;
    }

    @Override
    public boolean isNew() {
        return false;// id == null;
    }

    public void setActive(Boolean active) {
        active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @NonNull
    public String getCreatedByString() {
        return createdBy;
    }*/
    /*@NonNull
    public void setCreatedByString(String createdBy) {
        this.createdBy = createdBy;
    }*/
}
