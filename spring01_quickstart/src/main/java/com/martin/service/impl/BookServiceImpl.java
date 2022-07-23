package com.martin.service.impl;

import com.martin.dao.BookDao;
import com.martin.dao.impl.BookDaoImpl;
import com.martin.service.BookService;

public class BookServiceImpl implements BookService {
//    DI前
//    private BookDao bookDao= new BookDaoImpl();
//    DI后
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("bookservice save");
        bookDao.save();
    }

    // DI后
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
