package com.neosoft.serviceregistryeurekaserver10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryEurekaServer10Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryEurekaServer10Application.class, args);
    }

}
