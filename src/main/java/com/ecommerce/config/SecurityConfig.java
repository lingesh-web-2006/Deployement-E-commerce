 package com.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for simplicity
            .cors() // Enable CORS
            .and()
            .authorizeHttpRequests()
            .requestMatchers("/products/**").permitAll() // Allow public access
            .anyRequest().authenticated() // Other endpoints require auth
            .and()
            .httpBasic(); // Basic auth for testing

        return http.build();
    }
}
