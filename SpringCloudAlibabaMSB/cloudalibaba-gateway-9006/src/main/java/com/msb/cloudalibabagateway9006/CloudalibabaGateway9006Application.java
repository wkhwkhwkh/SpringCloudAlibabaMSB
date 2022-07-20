package com.msb.cloudalibabagateway9006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaGateway9006Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaGateway9006Application.class, args);
    }

}
