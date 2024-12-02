package com.evela.common_service.jwt;

import com.evela.common_service.util.JwtValidator;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTRequestFilter extends OncePerRequestFilter {
    private final JwtValidator jwtValidator;


    public JWTRequestFilter(JwtValidator jwtValidator) {
        this.jwtValidator = jwtValidator;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // Obtener el token del encabezado Authorization
        String token = extractTokenFromRequest(request);

        // Si el token es válido, puedes almacenarlo en el contexto para accederlo después
        if (token != null && jwtValidator.validateToken(token)) {
            String username = jwtValidator.extractUsername(token);
            // Establecer el usuario actual en el contexto (si es necesario)
            request.setAttribute("username", username);
        }

        // Continuar con la cadena de filtros
        filterChain.doFilter(request, response);
    }

    // Metodo para extraer el token del encabezado
    private String extractTokenFromRequest(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        if (header != null && header.startsWith("Bearer ")) {
            return header.substring(7);  // Eliminar el prefijo "Bearer "
        }
        return null;
    }
}
