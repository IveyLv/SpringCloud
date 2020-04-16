package com.ivey.springcloud.service;

import com.ivey.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/3 19:58
 * @Version 1.0
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
