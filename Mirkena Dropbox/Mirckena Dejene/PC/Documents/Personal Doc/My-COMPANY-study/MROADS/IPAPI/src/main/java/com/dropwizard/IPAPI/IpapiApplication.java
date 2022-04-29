package com.dropwizard.IPAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.Stack;

@SpringBootApplication
@EnableScheduling
public class IpapiApplication {

    public static void main(String[] args) {
     SpringApplication.run(IpapiApplication.class, args);
    }

}
