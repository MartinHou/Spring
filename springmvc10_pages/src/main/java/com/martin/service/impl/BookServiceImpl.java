package com.martin.service.impl;

import com.martin.controller.Code;
import com.martin.dao.BookDao;
import com.martin.domain.Book;
import com.martin.exception.BusinessException;
import com.martin.exception.SystemException;
import com.martin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "请不要这样嘛");
        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
