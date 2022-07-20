package com.msb.cloudalibabasentinelservice8402;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudalibabaSentinelService8402Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaSentinelService8402Application.class, args);
    }

}
