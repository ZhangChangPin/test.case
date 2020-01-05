package com.example.eurekaconsumer.feign;


import com.example.eurekaconsumer.entity.StudentTBl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("EUREKA-PROVIDER")
public interface StudentFeign {

    @RequestMapping(value="/getStudent", method= RequestMethod.GET)
    StudentTBl getStudent(@RequestParam("studentId") Integer studentId);
}
