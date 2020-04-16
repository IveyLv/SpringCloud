package com.ivey.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/13 9:43
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentApplication9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplication9002.class, args);
    }
}
