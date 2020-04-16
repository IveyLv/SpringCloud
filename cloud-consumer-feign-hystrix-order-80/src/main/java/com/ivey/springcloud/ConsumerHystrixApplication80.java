package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/9 18:26
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ConsumerHystrixApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixApplication80.class, args);
    }
}
