package com.ivey.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 9:47
 * @Version 1.0
 */
@Mapper
public interface AccountDao {

    // 扣减账户余额
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
