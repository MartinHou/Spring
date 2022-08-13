package com.martin.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MpConfig {
    @Bean
    public MybatisPlusInterceptor mpInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();  //定义大拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());  //添加小拦截器
        return interceptor;
    }
}
