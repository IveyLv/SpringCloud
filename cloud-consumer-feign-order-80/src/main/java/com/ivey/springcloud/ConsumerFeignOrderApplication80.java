package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/8 13:18
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignOrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignOrderApplication80.class, args);
    }
}
