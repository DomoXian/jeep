package com.leno.jeep;

import com.leno.jeep.elastic.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = {@ComponentScan.Filter
        (type = FilterType.ASSIGNABLE_TYPE, classes = {TestService.class})})
public class JeepApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeepApplication.class, args);
    }
}
