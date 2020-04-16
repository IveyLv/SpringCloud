package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/11 17:57
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class, args);
    }
}
