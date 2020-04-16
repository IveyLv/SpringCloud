package com.ivey.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ivey.springcloud.alibaba.myhandler.CustomerBlockHandler;
import com.ivey.springcloud.entities.CommonResult;
import com.ivey.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/14 16:06
 * @Version 1.0
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handlerException")
    public CommonResult byResource() {
        return new CommonResult<>(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    public CommonResult handlerException(BlockException exception) {
        return new CommonResult(404, exception.getClass().getCanonicalName() + "\t服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult<>(200, "按Url限流测试OK", new Payment(2020L, "serial002"));
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommonResult customerBlockHandler() {
        return new CommonResult<>(200, "按客户自定义测试OK", new Payment(2020L, "serial003"));
    }
}
