package test.com.service.impl;

import com.config.SpringConfiguration;
import com.domain.Students;
import com.service.IStudentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * StudentsServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * <p>
 * <p>
 * spring整合junit
 * 第一步：拷贝spring提供的整合jar包
 * spring-test-4.2.4.RELEASE.jar
 * 第二步：使用junit提供的一个注解，把原有的main函数替换掉，换成spring提供的
 * @RunWith 要换的类：SpringJunit4ClassRunner
 * 第三步：使用spring提供的注解告知spring，配置文件或者注解类所在的位置
 * @ContextConfiguration
 * @since <pre>Apr 29, 2019</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class StudentsServiceImplTest {
//    @Autowired
    @Resource(name = "studentsService")
    IStudentsService cs = null;

    @Test
    public void testFindAllStudents() throws Exception {
        /*ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IStudentsService cs = (IStudentsService) ac.getBean("studentsService");*/
        List<Students> list = cs.findAllStudents();
        for (Students stu :
                list) {
            System.out.println(stu);
        }
    }

    /**
     * Method: saveStudent(Students stu)
     */
    @Test
    public void testSaveStudent() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateStudent(Students stu)
     */
    @Test
    public void testUpdateStudent() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: deleteStudent(int id)
     */
    @Test
    public void testDeleteStudent() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: findStudentById(int id)
     */
    @Test
    public void testFindStudentById() throws Exception {
//TODO: Test goes here... 
    }

} 
