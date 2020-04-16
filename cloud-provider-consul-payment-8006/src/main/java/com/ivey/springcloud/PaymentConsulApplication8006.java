package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/7 11:50
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulApplication8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulApplication8006.class, args);
    }
}
