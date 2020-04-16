package com.ivey.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/8 10:00
 * @Version 1.0
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
