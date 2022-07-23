package com.martin.domain;

import com.martin.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Account implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void outMoney(String out, int amount) {
        String sql = "update t_account set money=money-? where uname=?";
        Object[] args = {amount, out};
        int update = jdbcTemplate.update(sql, args);
    }

    @Override
    public void inMoney(String in, int amount) {
        String sql = "update t_account set money=money+? where uname=?";
        Object[] args = {amount, in};
        int update = jdbcTemplate.update(sql, args);

    }
}
