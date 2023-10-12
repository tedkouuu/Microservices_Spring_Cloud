package com.example.springcloudconfserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfServerApplication.class, args);
    }

}
