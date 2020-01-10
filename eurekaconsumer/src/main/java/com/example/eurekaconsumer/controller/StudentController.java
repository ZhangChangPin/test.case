package com.example.eurekaconsumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.eurekaconsumer.entity.StudentTBl;
import com.example.eurekaconsumer.feign.StudentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentFeign studentFeign;

    @GetMapping("/getStudentCon")
    public JSONObject getStudentCon(Integer studentId){
        JSONObject jsonObject = studentFeign.getStudent(studentId);
        return jsonObject;
    }
}
