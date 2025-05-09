//package com.example.demo.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.List;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
////    @Autowired
////    private JwtRequestFilter jwtRequestFilter;
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.cors(withDefaults())
//                .csrf(csrf -> csrf.disable())
//                .authorizeRequests(auth ->
//                        auth.requestMatchers("/**").permitAll()  // Adjust according to your endpoints and security requirements
//                                .anyRequest().authenticated()
//                );
////                  .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
////        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//        return http.build();
//
//    }
//
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//
//        CorsConfiguration cors = new CorsConfiguration();
//        cors.setAllowedOrigins(List.of("http://localhost:3000/"));
//        cors.setAllowedMethods(List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//        cors.setAllowedHeaders(List.of("*"));
//        cors.setAllowCredentials(true);
//        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", cors);
//
//        return urlBasedCorsConfigurationSource;
//
//
//    }
//
//
//}
