package com.ivey.springcloud.alibaba.service;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 9:22
 * @Version 1.0
 */
public interface StorageService {

    void decrease(Long productId, Integer count);
}
