package com.evela.common_service.audit;

import com.evela.common_service.util.JwtValidator;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component("auditorAware")
public class AuditorAwareImpl implements AuditorAware<String>{
    private final JwtValidator jwtValidator;
    private final HttpServletRequest request;

    public AuditorAwareImpl(JwtValidator jwtValidator, HttpServletRequest request) {
        this.jwtValidator = jwtValidator;
        this.request = request;
    }

    @Override
    public Optional<String> getCurrentAuditor() {
        //return Optional.ofNullable(jwtValidator.getCurrentAuditor());
        String token = (String) request.getAttribute("username");
        if (jwtValidator.validateToken(token)){
            return Optional.of(jwtValidator.extractUsername(token));
        }
        return Optional.empty();
    }
}