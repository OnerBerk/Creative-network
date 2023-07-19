package com.onAir.Crea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CreaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreaApplication.class, args);
    }
}
