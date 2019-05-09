package com.dao.impl;

import com.dao.IStudentDao;
import com.domain.Students;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Override
    public Students findStudentById(int id) {
        List<Students> studentList = jdbcTemplate.query("select * from Students where id=?", new BeanPropertyRowMapper<Students>(Students.class), id);
        return studentList.isEmpty()?null:studentList.get(0);
    }

    @Override
    public void update(Students stu) {
        jdbcTemplate.update("update Students set FirstName=?,LastName=?,Gender=? where id=?", stu.getFirstName(),stu.getLastName(),stu.getGender(),stu.getId());
    }
}
