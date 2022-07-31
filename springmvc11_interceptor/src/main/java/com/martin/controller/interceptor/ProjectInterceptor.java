package com.martin.controller.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class ProjectInterceptor implements HandlerInterceptor {
    // 前置拦截器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String header = request.getHeader("Content-Type");  // 可用接口

        HandlerMethod handlerMethod = (HandlerMethod) handler;  // 反射得到调用的Controller类
        String name = handlerMethod.getMethod().getName();

        System.out.println("pre handler " + header + " " + name);

        return true; //false则不执行原始操作，到这里就结束了
    }

    //后置拦截器
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("post handler");
    }

    //完成后的拦截器（异常等）
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("after completion");
    }
}
