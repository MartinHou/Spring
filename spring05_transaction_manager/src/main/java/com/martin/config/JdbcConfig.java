package com.martin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Component
public class JdbcConfig {
    @Value("${uname}")
    private String uname;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;
    @Value("${driver}")
    private String driver;

    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setUsername(uname);
        ds.setPassword(password);
        ds.setUrl(url);
        ds.setDriverClassName(driver);
        return ds;
    }

    @Bean("transactionManager")
    public PlatformTransactionManager transactionManager(DataSource ds){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(ds);
        return transactionManager;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplate(DataSource ds){
        return new JdbcTemplate(ds);
    }
}
