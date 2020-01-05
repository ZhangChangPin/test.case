package com.example.eurekaprovider.mapper;

import com.example.eurekaprovider.entity.StudentTBl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface StudentTBlMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentTBl record);

    int insertSelective(StudentTBl record);

    StudentTBl selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(StudentTBl record);

    int updateByPrimaryKey(StudentTBl record);
}