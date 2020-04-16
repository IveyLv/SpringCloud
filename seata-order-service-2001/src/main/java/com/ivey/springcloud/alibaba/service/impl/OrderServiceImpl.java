package com.ivey.springcloud.alibaba.service.impl;

import com.ivey.springcloud.alibaba.dao.OrderDao;
import com.ivey.springcloud.alibaba.entity.Order;
import com.ivey.springcloud.alibaba.service.AccountService;
import com.ivey.springcloud.alibaba.service.OrderService;
import com.ivey.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 7:48
 * @Version 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Order order) {

        log.info("--->开始新建订单");
        // 1. 新建订单
        orderDao.create(order);

        log.info("--->订单微服务开始调用库存，做扣减Count");
        // 2. 扣减库存
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("--->订单微服务开始调用库存，做扣减结束");

        log.info("--->订单微服务开始调用账户，做扣减Money");
        // 3. 扣减账户
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("--->订单微服务开始调用账户，做扣减结束");

        log.info("--->修改订单状态开始");
        // 4. 修改订单状态
        orderDao.update(order.getUserId(), 0);
        log.info("--->修改订单状态结束");

        log.info("--->下订单结束");
    }
}
