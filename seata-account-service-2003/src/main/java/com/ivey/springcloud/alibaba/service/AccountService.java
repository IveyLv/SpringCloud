package com.ivey.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 9:51
 * @Version 1.0
 */
public interface AccountService {

    // 扣减账户余额
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
