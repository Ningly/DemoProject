package test.Service.impl; 

import domain.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IStudentsService;
import service.impl.StudentsServiceImpl;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:bean.xml"})
public class StudentsServiceImplTest {
    @Autowired
    IStudentsService cs=null;
/** 
* 
* Method: findAllStudents() 
* 
*/ 
@Test
public void testFindAllStudents() throws Exception {
    /*ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
    IStudentsService cs= (IStudentsService) ac.getBean("studentsService");*/
    List<Students> list=cs.findAllStudents();
    for (Students stu :
            list) {
        System.out.println(stu);
    }
} 

/** 
* 
* Method: saveStudent(Students stu) 
* 
*/ 
@Test
public void testSaveStudent() throws Exception {
    IStudentsService cs=new StudentsServiceImpl();
    Students stu=new Students();
    stu.setFirstName("雄安王");
    stu.setLastName("小白");
    stu.setGender(2);
    cs.saveStudent(stu);
} 

/** 
* 
* Method: updateStudent(Students stu) 
* 
*/ 
@Test
public void testUpdateStudent() throws Exception {
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteStudent(int id) 
* 
*/ 
@Test
public void testDeleteStudent() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findStudentById(int id) 
* 
*/ 
@Test
public void testFindStudentById() throws Exception { 
//TODO: Test goes here... 
} 


} 
