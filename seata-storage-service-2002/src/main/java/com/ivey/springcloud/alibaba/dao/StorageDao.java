package com.ivey.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 9:15
 * @Version 1.0
 */
@Mapper
public interface StorageDao {

    // 扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
