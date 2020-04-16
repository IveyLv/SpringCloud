package com.ivey.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/14 17:43
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerNacosOrderApplication84 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerNacosOrderApplication84.class, args);
    }
}
