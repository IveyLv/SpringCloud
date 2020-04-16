package com.ivey.springcloud.alibaba.controller;

import com.ivey.springcloud.alibaba.entity.CommonResult;
import com.ivey.springcloud.alibaba.entity.Order;
import com.ivey.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 8:04
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
