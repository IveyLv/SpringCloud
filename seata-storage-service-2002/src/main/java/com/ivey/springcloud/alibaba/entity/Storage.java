package com.ivey.springcloud.alibaba.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 9:10
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;
    private Long productId;
    private Integer total;  // 总库存
    private Integer used;   // 已用库存
    private Integer residue;    // 剩余库存
}
