package com.leno.jeep.common.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>线程池提供器
 * 提供两种线程池 cup计算性 io密集型
 * </p>
 *
 * @author: XianGuo
 * @date: 2018年05月18日
 */
public class ThreadPoolProvider {

    /**
     * 提供两种线程池 cup计算性 io密集型
     */
    private static ExecutorService executor;


    private static int nCpu = Runtime.getRuntime().availableProcessors();


    public static ExecutorService getExecutor() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(2 * nCpu + 1);
        }
        return executor;
    }

}
