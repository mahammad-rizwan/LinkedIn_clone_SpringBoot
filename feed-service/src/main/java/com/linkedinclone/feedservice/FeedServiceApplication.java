package com.linkedinclone.feedservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Bootstrap class only - this is a scaffold.
 * See this service's README.md for the full list of classes still to be implemented
 * inside controller/service/repository/entity/dto/... packages.
 *
 * Run standalone (no parent reactor needed):
 *   mvn spring-boot:run
 */
@SpringBootApplication
@EnableFeignClients
@EnableCaching
@EnableScheduling
public class FeedServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedServiceApplication.class, args);
    }
}
