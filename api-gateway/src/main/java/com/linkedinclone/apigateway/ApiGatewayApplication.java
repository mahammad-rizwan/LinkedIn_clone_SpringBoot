package com.linkedinclone.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bootstrap class only - this is a scaffold.
 * See this service's README.md for the full list of classes still to be implemented
 * inside controller/service/repository/entity/dto/... packages.
 *
 * Run standalone (no parent reactor needed):
 *   mvn spring-boot:run
 */
@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
