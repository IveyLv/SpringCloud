package com.ivey.springcloud.service.impl;

import com.ivey.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/12 11:56
 * @Version 1.0
 */
@EnableBinding(Source.class)    // 定义消息推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;  // 消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("******serial: " + serial);
        return serial;
    }
}
