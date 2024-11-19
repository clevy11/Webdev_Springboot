package com.auca.innovation.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.thymeleaf.extras.springsecurity6.dialect.SpringSecurityDialect;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CustomerRelManagement2Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRelManagement2Application.class, args);
    }

}
