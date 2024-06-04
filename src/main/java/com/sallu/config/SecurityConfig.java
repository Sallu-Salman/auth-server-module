package com.sallu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    BearerTokenAuthFilter bearerTokenAuthFilter;


    private static final String[] WHITELIST_URLS = {
            "/register",
            "/login",
            "/grantcode",
            "/accountverification",
            "/generateresetpasswordlink",
            "/changepassword",
            "/refreshaccesstoken",
            "/",
            "/index.html",
            "/register.html",
            "/forgot_password.html",
            "/styles.css",
            "/sign-google.jpg",
            "/sing-git.jpg"
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(request -> {
                    request.requestMatchers(WHITELIST_URLS).permitAll();
                    request.anyRequest().authenticated();
                })
                .csrf(AbstractHttpConfigurer::disable)
                .addFilterAfter(bearerTokenAuthFilter, BasicAuthenticationFilter.class);
        return http.build();
    }



}
