package com.martin.service.dao;

import com.martin.dao.BookDao;
import com.martin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao1")
    private BookDao bookDao;

    @Value("${name}")
    private String usrname;
    @Override
    public void save() {
        bookDao.save();
        System.out.println("service saved with user " + usrname);
    }
}
