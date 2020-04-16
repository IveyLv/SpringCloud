package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/7 16:03
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulApplication80.class, args);
    }
}
