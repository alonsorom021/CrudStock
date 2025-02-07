package com.control.stock.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig {

    /**
     * Este método define un bean para el codificador de contraseñas BCryptPasswordEncoder.
     * BCryptPasswordEncoder es una implementación de PasswordEncoder que utiliza BCrypt para el hash de contraseñas.
     *
     * @return una nueva instancia de BCryptPasswordEncoder.
     */
    @Bean	
    BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}