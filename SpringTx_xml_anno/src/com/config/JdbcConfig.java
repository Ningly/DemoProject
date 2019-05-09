package com.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("${jdbc.driverClass}")
    private String driverClassName;
    @Value("${jdbc.jdbcUrl}")
    private String url;
    @Value("${jdbc.user}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    
    @Bean("dataSource")
    public DataSource getDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(@Qualifier("dataSource") DataSource dataSource){
        JdbcTemplate jt=new JdbcTemplate(dataSource);
        return jt;
    }
}
