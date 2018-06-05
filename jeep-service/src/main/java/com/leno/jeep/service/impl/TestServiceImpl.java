package com.leno.jeep.service.impl;

import com.leno.jeep.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <p>测试服务</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {


    @Async
    @Override
    public void async(int i) {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("当前值{}，执行完毕耗时：{}",i,System.currentTimeMillis()-start);
    }
}
