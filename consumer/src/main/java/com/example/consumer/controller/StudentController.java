package com.example.consumer.controller;

import com.example.consumer.Feign.StudentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  StudentController {
    @Autowired
    private StudentFeign studentFeign;

    
}
