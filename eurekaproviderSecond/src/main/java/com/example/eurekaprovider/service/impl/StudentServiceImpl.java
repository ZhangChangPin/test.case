package com.example.eurekaprovider.service.impl;

import com.example.eurekaprovider.dao.StudentDao;
import com.example.eurekaprovider.entity.StudentTBl;
import com.example.eurekaprovider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public int deleteByPrimaryKey(Integer studentId) {
        return studentDao.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(StudentTBl record) {
        return studentDao.insert(record);
    }

    @Override
    public int insertSelective(StudentTBl record) {
        return studentDao.insertSelective(record);
    }

    @Override
    public StudentTBl selectByPrimaryKey(Integer studentId) {
        return studentDao.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentTBl record) {
        return studentDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentTBl record) {
        return studentDao.updateByPrimaryKey(record);
    }
}
