package com.ivey.springcloud.alibaba.service;

import com.ivey.springcloud.entities.CommonResult;
import com.ivey.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/14 17:51
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
