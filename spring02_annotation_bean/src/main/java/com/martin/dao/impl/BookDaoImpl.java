package com.martin.dao.impl;

import com.martin.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao1")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("saved dao");
    }
}
