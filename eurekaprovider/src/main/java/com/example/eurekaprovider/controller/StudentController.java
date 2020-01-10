package com.example.eurekaprovider.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.eurekaprovider.entity.StudentTBl;
import com.example.eurekaprovider.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Value("${server.port}")
    private String port;
    @GetMapping("/getStudent")
    private JSONObject getStudent(@RequestParam("studentId") Integer studentId){
        JSONObject messageJson = new JSONObject();
        StudentTBl studentTBl = studentService.selectByPrimaryKey(studentId);
        messageJson.put("port",port);
        messageJson.put("data",studentTBl);
        return messageJson;
    }
}
