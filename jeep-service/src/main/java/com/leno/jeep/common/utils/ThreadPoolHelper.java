package com.leno.jeep.common.utils;

import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * <p>线程池帮助类</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
public class ThreadPoolHelper {

    /**
     * 定义线程池
     */
    private static ThreadPoolTaskExecutor IO_SINGLE_EXECUTOR;


    /**
     * 获取线程池配置
     */
    public static TaskExecutor getTaskExecutor() {

        if (IO_SINGLE_EXECUTOR == null) {
            synchronized (ThreadPoolHelper.class) {
                if (IO_SINGLE_EXECUTOR == null) {
                    int coreSize = Runtime.getRuntime().availableProcessors() * 10; // io密集型配置cpu核数/(1-阻塞率)
                    IO_SINGLE_EXECUTOR = new ThreadPoolTaskExecutor();
                    IO_SINGLE_EXECUTOR.setCorePoolSize(coreSize); // io密集型配置
                    IO_SINGLE_EXECUTOR.setKeepAliveSeconds(3000);
                    IO_SINGLE_EXECUTOR.setMaxPoolSize(coreSize + 5);
                }
            }
        }
        return IO_SINGLE_EXECUTOR;

    }

}
