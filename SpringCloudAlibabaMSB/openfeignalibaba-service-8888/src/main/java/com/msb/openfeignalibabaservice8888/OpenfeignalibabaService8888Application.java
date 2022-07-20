package com.msb.openfeignalibabaservice8888;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OpenfeignalibabaService8888Application {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignalibabaService8888Application.class, args);
    }

}
