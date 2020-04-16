package com.ivey.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 10:03
 * @Version 1.0
 */
@Configuration
@MapperScan("com.ivey.springcloud.alibaba.dao")
public class MybatisConfig {
}
