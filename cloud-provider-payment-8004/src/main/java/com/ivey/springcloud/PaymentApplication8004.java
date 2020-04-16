package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/5 21:17
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于向使用consul或zookeeper作为注册中心时注册服务
public class PaymentApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class, args);
    }
}
