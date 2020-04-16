package com.ivey.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/13 9:25
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplication9001.class, args);
    }
}
