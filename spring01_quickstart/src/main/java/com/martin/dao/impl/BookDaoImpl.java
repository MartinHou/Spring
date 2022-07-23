package com.martin.dao.impl;

import com.martin.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("bookdao saved");
    }
}
