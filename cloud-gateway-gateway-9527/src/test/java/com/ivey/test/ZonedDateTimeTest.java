package com.ivey.test;

import java.time.ZonedDateTime;

/**
 * @Description
 * @Author IveyLv
 * @Date 2020/4/10 19:18
 * @Version 1.0
 */
public class ZonedDateTimeTest {

    public static void main(String[] args) {
        // 2020-04-10T19:19:13.199+08:00[Asia/Shanghai]
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
