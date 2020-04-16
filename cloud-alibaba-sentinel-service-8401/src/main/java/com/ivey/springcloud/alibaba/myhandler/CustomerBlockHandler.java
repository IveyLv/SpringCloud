package com.ivey.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ivey.springcloud.entities.CommonResult;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/14 16:36
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException exception) {
        return new CommonResult<>(444, "按客户自定义, global CustomerBlockHandler ---> 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult<>(444, "按客户自定义, global CustomerBlockHandler ---> 2");
    }
}
