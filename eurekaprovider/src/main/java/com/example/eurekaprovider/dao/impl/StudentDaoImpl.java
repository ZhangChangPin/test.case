package com.example.eurekaprovider.dao.impl;

import com.example.eurekaprovider.dao.StudentDao;
import com.example.eurekaprovider.entity.StudentTBl;
import com.example.eurekaprovider.mapper.StudentTBlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Component
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private StudentTBlMapper studentTBlMapper;
    @Override
    public int deleteByPrimaryKey(Integer studentId) {
        return studentTBlMapper.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(StudentTBl record) {
        return studentTBlMapper.insert(record);
    }

    @Override
    public int insertSelective(StudentTBl record) {
        return studentTBlMapper.insertSelective(record);
    }

    @Override
    public StudentTBl selectByPrimaryKey(Integer studentId) {
        return studentTBlMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByPrimaryKeySelective(StudentTBl record) {
        return studentTBlMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(StudentTBl record) {
        return studentTBlMapper.updateByPrimaryKey(record);
    }
}
