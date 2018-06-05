package com.leno.jeep.service;

import org.springframework.scheduling.annotation.Async;

/**
 * <p>测试服务</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
public interface TestService {


    @Async
    void async(int i);
}
