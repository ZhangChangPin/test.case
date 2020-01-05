package com.example.eurekaconsumer.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class StudentFeignConfig {
    @Bean
    public Logger.Level level(){
        // 设置Feign的日志级别为FULL
        return Logger.Level.FULL;
    }
}
