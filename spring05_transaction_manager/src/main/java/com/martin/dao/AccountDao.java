package com.martin.dao;

public interface AccountDao {
    void outMoney(String out,int amount);
    void inMoney(String in, int amount);
}
