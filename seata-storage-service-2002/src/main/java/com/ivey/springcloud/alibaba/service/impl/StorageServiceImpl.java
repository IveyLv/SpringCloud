package com.ivey.springcloud.alibaba.service.impl;

import com.ivey.springcloud.alibaba.dao.StorageDao;
import com.ivey.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/15 9:23
 * @Version 1.0
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("--->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        LOGGER.info("--->storage-service中扣减库存结束");
    }
}
