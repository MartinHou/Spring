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
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        if(id==0){
            throw new BusinessException(Code.BUSINESS_ERR, "请不要这样嘛");
        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        try {
            int a=1/0;
        }catch (ArithmeticException e){
            throw new SystemException(Code.SYS_ERR, "请稍后");
        }
        return bookDao.getAll();
    }
}
