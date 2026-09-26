package com.linkedinclone.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Bootstrap class only - this is a scaffold.
 * See this service's README.md for the full list of classes still to be implemented
 * inside controller/service/repository/entity/dto/... packages.
 *
 * Run standalone (no parent reactor needed):
 *   mvn spring-boot:run
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}
