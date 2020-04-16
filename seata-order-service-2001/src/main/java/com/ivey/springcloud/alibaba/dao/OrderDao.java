package com.ivey.springcloud.alibaba.dao;

import com.ivey.springcloud.alibaba.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 7:33
 * @Version 1.0
 */
@Mapper
public interface OrderDao {

    // 新建订单
    void create(Order order);

    // 修改订单状态
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
