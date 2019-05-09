package com.dao.impl;

import com.dao.IStudentDao;
import com.doman.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class StudentDao extends JdbcDaoSupport implements IStudentDao {
    
    
    @Override
    public Student findById(int id) {
        List<Student> studentList = getJdbcTemplate().query("select * from Students where id=?", new BeanPropertyRowMapper<Student>(Student.class), id);
        return studentList.isEmpty()?null:studentList.get(0);
}

    @Override
    public Student findByName(String name) {
        List<Student> studentList = getJdbcTemplate().query("select * from Students where firstname=?", new BeanPropertyRowMapper<Student>(Student.class), name);
        return studentList.isEmpty()?null:studentList.get(0);
    }

    @Override
    public void update(Student stu) {
        getJdbcTemplate().update("update Students set FirstName=?,LastName=?,Gender=? where id=?", stu.getFirstName(),stu.getLastName(),stu.getGender(),stu.getId());
    }
}
