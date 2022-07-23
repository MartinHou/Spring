package com.martin;

import com.martin.service.BookService;
import com.martin.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService =  new BookServiceImpl();
        bookService.save();
    }
}
