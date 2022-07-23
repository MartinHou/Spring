package com.martin.service.impl;

import com.martin.dao.AccountDao;
import com.martin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String out, String in, int amount) {
        accountDao.outMoney(out,amount);
//        int a=1/0;
        accountDao.inMoney(in,amount);

    }
}
