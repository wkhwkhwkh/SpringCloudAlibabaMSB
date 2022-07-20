package com.msb.cloudalibabagateway9006.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        //构建route
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //具体的路由地址
        routes.route("path_msb",r->r.path("/consumer/**").uri("http://localhost:9003/albaba-nacos-consumer-nacos")).build();
        return routes.build();
    }


    /*@Bean 配置多个路由
    public RouteLocator getRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
        //构建route
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //具体的路由地址
        routes.route("path_msb",r->r.path("/consumer/**").uri("http://localhost:9003/albaba-nacos-consumer-nacos")).build();
        return routes.build();
    }*/
}
