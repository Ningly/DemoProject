package com.service;

import com.domain.Students;

/*
* 业务层接口
* */
public interface IStudentsService {
    Students findStudentById(int id);
    Students change(int id1,int id2,int arg);
}
