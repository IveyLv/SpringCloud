package com.ivey.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/14 17:28
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPaymentApplication9003 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPaymentApplication9003.class, args);
    }
}
