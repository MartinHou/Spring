package com.martin.config;

import com.martin.controller.interceptor.ProjectInterceptor;
import com.martin.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.martin.controller")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private ProjectInterceptor interceptor;

    @Autowired
    private ProjectInterceptor2 interceptor2;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }

    /*
        多拦截器下，按registry顺序为正序，pre handler以正序执行，post和after competition按倒序。
        如果某一pre handler返回false，则其后面所有都不执行，直接跳到对应after completion后面再执行。
        比如 pre handler2返回false，则下一个应执行after completion1而不是2。
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/books","/books/*"); //不仅拦截/books,还拦/books/xxx
        registry.addInterceptor(interceptor2).addPathPatterns("/books","/books/*"); //不仅拦截/books,还拦/books/xxx
    }
}
