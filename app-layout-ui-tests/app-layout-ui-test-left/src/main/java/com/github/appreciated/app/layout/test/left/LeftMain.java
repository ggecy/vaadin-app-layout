package com.github.appreciated.app.layout.test.left;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class LeftMain extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LeftMain.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LeftMain.class);
    }
}
