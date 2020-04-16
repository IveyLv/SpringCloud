package com.ivey.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/14 9:44
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceApplication8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApplication8401.class, args);
    }
}
