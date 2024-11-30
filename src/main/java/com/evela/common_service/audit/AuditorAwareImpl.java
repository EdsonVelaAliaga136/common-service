package com.evela.common_service.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component("AuditorAwareImpl")
public class AuditorAwareImpl implements AuditorAware<String>{
    private final AuditorAwareProvider auditorAwareProvider;

    public AuditorAwareImpl(AuditorAwareProvider auditorAwareProvider) {
        this.auditorAwareProvider = auditorAwareProvider;
    }

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.ofNullable(auditorAwareProvider.getCurrentAuditor());
    }
}