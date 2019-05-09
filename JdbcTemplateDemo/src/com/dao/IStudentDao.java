package com.dao;

import com.doman.Student;

public interface IStudentDao {
    Student findById(int id);
    Student findByName(String name);
    void update(Student stu);
}
