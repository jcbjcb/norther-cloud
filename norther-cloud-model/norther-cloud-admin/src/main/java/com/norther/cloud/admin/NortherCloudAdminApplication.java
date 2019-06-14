package com.norther.cloud.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NortherCloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NortherCloudAdminApplication.class, args);
    }

}
