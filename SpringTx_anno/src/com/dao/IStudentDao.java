package com.dao;

import com.domain.Students;

/*
* 持久层接口
* */
public interface IStudentDao {
    Students findStudentById(int id);
    void update(Students stu);
    
}
