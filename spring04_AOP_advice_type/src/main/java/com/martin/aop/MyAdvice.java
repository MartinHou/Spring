package com.martin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.martin.*.*Dao.update())") //调用接口的方法，不是实现类方法
    public void pt() {}

    @Before("pt()")
    public void fn1() {
        System.out.println("before advice");
    }

    @After("pt()")
    public void fn2(){
        System.out.println("after");
    }

    @Pointcut("execution(int com.martin.*.*Dao.select(int))")
    public void pt_select() {}

    @Around("pt_select()")
    public Object fn3(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        args[0] = 9;    // 可以获取客户层传的值，进行修改后，再传给原方法（一套逻辑适用多个方法）
        System.out.println("around 1");     // 前
        Object ret= pjp.proceed(args);  // 原始方法
        System.out.println("around 2");     // 后
        return ret;
    }

}
