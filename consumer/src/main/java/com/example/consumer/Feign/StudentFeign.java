package com.example.consumer.Feign;

import com.example.common.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@FeignClient(name = "provider")
public interface StudentFeign {
    @RequestMapping("/student/all")
    Student getStudentInfoById(@RequestParam(name = "studentId") BigInteger studentId);

    @RequestMapping("/student/create")
    String studentCreate(@RequestParam(name = "name") String name,@RequestParam(name = "gender") Integer gender);
    

    @RequestMapping("/student/update")
    String studentUpdate(@RequestParam(name = "studentId") BigInteger studentId,@RequestParam(name = "name") String name,@RequestParam(name = "gender") Integer gender);

    @RequestMapping("/student/delete")
    String studentDelete(@RequestParam(name = "studentId") BigInteger studentId);
}
