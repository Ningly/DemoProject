package com;

import com.doman.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //定义数据源
//        DriverManagerDataSource ds=new DriverManagerDataSource("jdbc:sqlserver://localhost:1433;DatabaseName=Tutoral", "sa", "Sa123456");
//        ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        //1. 获取对象
//        JdbcTemplate jt=new JdbcTemplate(ds);
        
//        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        
//        JdbcTemplate jt=(JdbcTemplate) ac.getBean("jdbcTemplate");
        //2. 执行操作
//        jt.execute("insert into Students(FirstName,LastName,Gender) values ('3','3',3)");



        //1. 获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2 获取bean对象
        JdbcTemplate jt=(JdbcTemplate) ac.getBean("jdbcTemplate");
        //3. 执行操作
        //保存
//        jt.update("insert into Students(FirstName,LastName,Gender) values (?,?,?)","fff","fff",5);
        //更新
//        jt.update("update Students set FirstName=? where id=7","eee");
        // 删除
//        jt.update("delete from Students where id=7");
        // 查询
        List<Student> list = jt.query("select * from Students where id>?", new BeanPropertyRowMapper<Student>(Student.class), 1);
        for (Student stu:
                list) {
            System.out.println(stu);
        }
        
    }
}
