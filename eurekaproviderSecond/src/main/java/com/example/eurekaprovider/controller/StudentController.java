package com.example.eurekaprovider.controller;

import com.example.eurekaprovider.entity.StudentTBl;
import com.example.eurekaprovider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    private StudentTBl getStudent(@RequestParam("studentId") Integer studentId){
        StudentTBl studentTBl = studentService.selectByPrimaryKey(studentId);
        return studentTBl;
    }
}
