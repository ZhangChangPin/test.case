package com.example.eurekaprovider.dao;

import com.example.eurekaprovider.entity.StudentTBl;

public interface StudentDao {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentTBl record);

    int insertSelective(StudentTBl record);

    StudentTBl selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(StudentTBl record);

    int updateByPrimaryKey(StudentTBl record);
}
