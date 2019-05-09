package com.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcDaoSupport {
    
    /*ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
    public JdbcTemplate jdbcTemplate=(JdbcTemplate)ac.getBean("jdbcTemplate");*/
    
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    /*public void setTest(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setDataSource(DataSource dataSource){
        if(jdbcTemplate==null)
            createJdbcTemplate(dataSource);
    }

    private void createJdbcTemplate(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }
}
