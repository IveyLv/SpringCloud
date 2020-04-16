package com.ivey.springcloud.alibaba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 9:44
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;
    private Long userId;
    private BigDecimal total;   // 总额度
    private BigDecimal used;    // 已用额度
    private BigDecimal residue; // 剩余额度
}
