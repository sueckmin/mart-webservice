package com.moons.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableJpaAuditing
@SpringBootApplication
@EnableResourceServer
@EnableAuthorizationServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
