package com.astrolab.authserver.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsFilterConfiguration {

    @Bean
    @SuppressWarnings("rawtypes")
    public FilterRegistrationBean corsFilter() {
        
    	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        
        @SuppressWarnings("unchecked") 
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        
        return bean;
    }

}