package com.example.nettyclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: zhou yu
 * @create: 2021-06-01 13:49
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public LogConfigInterCeptor initTraceInterceptor() {
        return new LogConfigInterCeptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(initTraceInterceptor()).addPathPatterns("/**");
    }
}
