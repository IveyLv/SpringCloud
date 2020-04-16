package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/11 16:34
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3355.class, args);
    }
}
