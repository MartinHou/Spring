package com.martin.dao.impl;

import com.martin.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("bookdao2");
    }
}
