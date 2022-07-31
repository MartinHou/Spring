package com.martin.controller;

import com.martin.exception.BusinessException;
import com.martin.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.ResultSet;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送消息给运维
        //发送邮件给开发，包含ex堆栈
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(), ex.getMessage(), "系统繁忙，请稍后再试");
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result(666, null, "exception");
    }
}
