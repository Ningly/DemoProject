package com.service.impl;

import com.dao.IStudentDao;
import com.domain.Students;
import com.service.IStudentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentsService")
public class StudentsServiceImpl implements IStudentsService {

    @Resource(name = "studentDao")
    private IStudentDao studentDao;

    @Override
    public Students findStudentById(int id) {
        return studentDao.findStudentById(id);
    }

    @Override
    public Students change(int id1, int id2, int arg) {
        // 1. 根据ID获取信息
        Students source=studentDao.findStudentById(id1);
        Students target=studentDao.findStudentById(id2);
        //2. 操作
        source.setGender(source.getGender()-arg);
        target.setGender(target.getGender()+arg);
        // 3. 更新
        studentDao.update(source);
        studentDao.update(target);
        return null;
    }
}
