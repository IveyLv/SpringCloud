package com.ivey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/11 12:05
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication3344.class, args);
    }
}
