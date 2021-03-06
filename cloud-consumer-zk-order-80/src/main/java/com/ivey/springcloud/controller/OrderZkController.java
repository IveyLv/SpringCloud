package com.ivey.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/6 19:26
 * @Version 1.0
 */
@RestController
public class OrderZkController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
