package com.dao.impl;

/*
public class StudentDao1 extends JdbcDaoSupport implements IStudentDao {
    
    @Override
    public Student findById(int id) {
        List<Student> studentList = jdbcTemplate.query("select * from Students where id=?", new BeanPropertyRowMapper<Student>(Student.class), id);
        return studentList.isEmpty()?null:studentList.get(0);
}

    @Override
    public Student findByName(String name) {
        List<Student> studentList = jdbcTemplate.query("select * from Students where firstname=?", new BeanPropertyRowMapper<Student>(Student.class), name);
        return studentList.isEmpty()?null:studentList.get(0);
    }

    @Override
    public void update(Student stu) {
        jdbcTemplate.update("update Students set FirstName=?,LastName=?,Gender=? where id=?", stu.getFirstName(),stu.getLastName(),stu.getGender(),stu.getId());
    }
}
*/
