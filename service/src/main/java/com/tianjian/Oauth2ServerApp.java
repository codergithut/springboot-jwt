package com.tianjian;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by tianjian on 2019/1/17.
 */
@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2ServerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Oauth2ServerApp.class).run(args);
    }
}
