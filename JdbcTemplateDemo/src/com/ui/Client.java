package com.ui;

import com.dao.IStudentDao;
import com.doman.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IStudentDao studentDao=(IStudentDao)ac.getBean("studentDao");
        Student stu = studentDao.findById(2);
        System.out.println(stu);
    }
}
