package com.leno.jeep.common.config;

import com.leno.jeep.common.utils.ThreadPoolHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * <p>线程池配置</p>
 *
 * @author: XianGuo
 * @date: 2018年04月28日
 */
@Configuration
@EnableAsync
public class ThreadPoolConfig {

    @Bean
    public TaskExecutor getTaskExecutor() {
        return ThreadPoolHelper.getTaskExecutor();
    }
}
