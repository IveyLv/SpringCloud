package com.ivey.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/9 20:39
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService fall back-paymentInfo_Timeout";
    }
}
