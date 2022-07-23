package com.martin;

import com.martin.config.SpringConfig;
import com.martin.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao book = context.getBean(BookDao.class);
        book.update();
//        book.save();
    }
}
