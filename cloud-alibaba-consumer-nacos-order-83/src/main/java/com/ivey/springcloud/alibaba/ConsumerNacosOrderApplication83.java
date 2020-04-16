package com.ivey.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/13 9:54
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerNacosOrderApplication83 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerNacosOrderApplication83.class, args);
    }
}
