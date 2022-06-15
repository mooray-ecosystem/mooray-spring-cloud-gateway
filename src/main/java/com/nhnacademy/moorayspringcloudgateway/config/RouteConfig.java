package com.nhnacademy.moorayspringcloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator accountRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                      .route(predicateSpec -> predicateSpec.path("/members/**")
                                                           .uri("http://localhost:8888"))
                      .route(predicateSpec -> predicateSpec.path("/projects/**")
                                                           .uri("http://localhost:9999"))
                      .build();
    }

}
