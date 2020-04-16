package com.ivey.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/14 9:46
 * @Version 1.0
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        /*try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "--->testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "-->testB");
        return "--->testB";
    }

    @GetMapping("/testC")
    public String testC() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName() + "-->testC 测试RT");
        return "--->testC";
    }

    @GetMapping("/testD")
    public String testD() {
        log.info(Thread.currentThread().getName() + "-->testD 异常比例");
        int age = 10 / 0;
        return "--->testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info(Thread.currentThread().getName() + "-->testE 异常数");
        int age = 10 / 0;
        return "--->testE";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "dealHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {

        return "--->testHotKey";
    }

    public String dealHotKey(String p1, String p2, BlockException blockException) {
        return "--->dealHotKey";
    }
}
