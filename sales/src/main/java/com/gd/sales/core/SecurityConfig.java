package com.gd.sales.core;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class SecurityConfig {

    /**
     * Integra la configuración de CORS con Spring Security
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .cors(cors -> cors.configurationSource(corsConfigurationSource())) // Activa CORS
                .authorizeHttpRequests(auth -> {
                    auth.anyRequest().permitAll();
                });

        return http.getOrBuild();
    }

    /**
     * Configuración de CORS personalizada
     */
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        // agrega todas las rutas permitidas
        configuration.setAllowedOrigins(List.of("*"));

        // decimos que operaciones http estan permitidos
        configuration.setAllowedMethods(List.of("GET", "POST", "PATCH", "DELETE", "PUT"));

        // decimos que headers estan permitidos
        configuration.setAllowedHeaders(List.of("Authorization", "Content-Type"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        // aplicamos CORS a todas las rutas del sistema
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
