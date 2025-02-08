package com.evela.common_service.service;

import com.evela.common_service.base.AuditMetadata;
import com.evela.common_service.context.AuditContext;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommonService {
    public void updateAuditInfo(){
        AuditMetadata auditMetadata = new AuditMetadata();
        auditMetadata.setCreatedBy(AuditContext.getCurrentUser());
        auditMetadata.setCreatedOn(LocalDateTime.now());
        auditMetadata.setUpdatedBy(AuditContext.getCurrentUser());
        auditMetadata.setUpdatedOn(LocalDateTime.now());
    }

    /*@Autowired
    private MenuRepository menuRepository; // Repositorio para la entidad Menu
*/
    /*public void updateAuditInfo(Long menuId) {
        Optional<Menu> menuOptional = menuRepository.findById(menuId);
        if (menuOptional.isPresent()) {
            Menu menu = menuOptional.get();
            AuditMetadata auditMetadata = menu.getAuditMetadata();
            if (auditMetadata == null) {
                auditMetadata = new AuditMetadata();
                menu.setAuditMetadata(auditMetadata);
            }
            auditMetadata.setCreatedBy(AuditContext.getCurrentUser());
            auditMetadata.setCreatedOn(LocalDateTime.now());
            auditMetadata.setUpdatedBy(AuditContext.getCurrentUser());
            auditMetadata.setUpdatedOn(LocalDateTime.now());

            menuRepository.save(menu); // Guarda la entidad actualizada en la base de datos
        }
    }*/
}
