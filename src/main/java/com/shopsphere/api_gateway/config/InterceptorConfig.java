package com.shopsphere.api_gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.shopsphere.api_gateway.filter.RateLimitFilter;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private RateLimitFilter rateLimitFilter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(rateLimitFilter);
    }
}