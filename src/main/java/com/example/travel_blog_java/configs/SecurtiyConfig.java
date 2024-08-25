package com.example.travel_blog_java.configs;

import com.example.travel_blog_java.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true)
public class SecurtiyConfig {
    @Value("${ff4j.webconsole.username:admin}")
    private String admin;

    @Value("${ff4j.webconsole.password:ff4j}")
    private String adminPasswd;

    @Value("${ff4j.webconsole.url:/ff4j-web-console}")
    private String webConsoleUrl;

    private final UsersRepository userRepository;


    public SecurtiyConfig(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf -> csrf.disable())
                .cors(Customizer.withDefaults())
                .sessionManagement(c -> c.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(
                        request ->
                                request.requestMatchers(HttpMethod.GET, "/api/").hasAnyRole("ADMIN", "USER")
                                        .requestMatchers(HttpMethod.POST, "/api/tasks/**").hasAnyRole("ADMIN", "USER")
                                        .requestMatchers(HttpMethod.PUT, "/api/tasks/**").hasAnyRole("ADMIN", "USER")
                                        .requestMatchers(HttpMethod.DELETE, "/api/tasks/**").hasAnyRole("ADMIN", "USER")
                                        .requestMatchers(webConsoleUrl + "/**")
                                        .hasRole("ADMIN")
                                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .build();
    }
}
