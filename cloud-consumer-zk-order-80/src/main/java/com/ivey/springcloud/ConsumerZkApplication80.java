package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/6 17:50
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZkApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerZkApplication80.class, args);
    }
}
