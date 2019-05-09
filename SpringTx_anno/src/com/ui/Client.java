package com.ui;

import com.config.SpringConfiguration;
import com.domain.Students;
import com.service.IStudentsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IStudentsService studentsService=(IStudentsService)ac.getBean("studentsService");
        Students stu1 = studentsService.findStudentById(1);
        Students stu2 = studentsService.findStudentById(2);
        System.out.println(stu1);
        System.out.println(stu2);
        
        studentsService.change(1, 2, 2);
        Students stu3 = studentsService.findStudentById(1);
        Students stu4 = studentsService.findStudentById(2);
        System.out.println(stu3);
        System.out.println(stu4);
    }
}
