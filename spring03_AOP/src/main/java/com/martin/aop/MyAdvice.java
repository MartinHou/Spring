package com.martin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Before("pt()") //当pt的AOP被激活，在pt前执行fn
    public void fn() {
        System.out.println(System.currentTimeMillis());
    }

    @Pointcut("execution(void com.martin.*.*.*Impl.update())")//当执行update方法时，跳转至此切入点
    public void pt() {}
}
