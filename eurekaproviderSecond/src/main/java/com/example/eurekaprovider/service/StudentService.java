package com.example.eurekaprovider.service;


import com.example.eurekaprovider.entity.StudentTBl;

public interface StudentService {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentTBl record);

    int insertSelective(StudentTBl record);

    StudentTBl selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(StudentTBl record);

    int updateByPrimaryKey(StudentTBl record);
}
