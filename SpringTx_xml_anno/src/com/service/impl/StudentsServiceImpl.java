package com.service.impl;

import com.dao.IStudentDao;
import com.domain.Students;
import com.service.IStudentsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("studentsService")
//@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)  //只读性
@Transactional(propagation = Propagation.REQUIRED,readOnly = false)  //读写型
public class StudentsServiceImpl implements IStudentsService {

    @Resource(name = "studentDao")
    private IStudentDao studentDao;

    @Override
    public Students findStudentById(int id) {
        return studentDao.findStudentById(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Students change(int id1, int id2, int arg) {
        // 1. 根据ID获取信息
        Students source = studentDao.findStudentById(id1);
        Students target = studentDao.findStudentById(id2);
        //2. 操作
        source.setGender(source.getGender() - arg);
        target.setGender(target.getGender() + arg);
        // 3. 更新
        studentDao.update(source);
        studentDao.update(target);
//        int i=1/0;
        return null;
    }
}
