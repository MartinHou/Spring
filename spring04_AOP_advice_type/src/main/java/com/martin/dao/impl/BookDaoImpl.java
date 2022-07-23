package com.martin.dao.impl;

import com.martin.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book saved");
    }

    @Override
    public void update() {
        System.out.println("book updated");
    }

    @Override
    public int select(int a) {
        System.out.println("book selected " + a);
        return 100;
    }
}
