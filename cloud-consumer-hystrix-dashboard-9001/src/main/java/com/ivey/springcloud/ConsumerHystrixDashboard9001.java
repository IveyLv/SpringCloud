package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/10 11:36
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboard9001.class, args);
    }
}
