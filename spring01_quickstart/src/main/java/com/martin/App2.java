package com.martin;

import com.martin.dao.BookDao;
import com.martin.service.BookService;
import com.martin.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class App2 {
    public static void main(String[] args) {
        //获取IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
//        BookService bookService = (BookService) context.getBean("bookService");
//        BookService bookService = context.getBean("bookService", BookService.class);
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
