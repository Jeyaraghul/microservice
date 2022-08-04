package com.example.springeurekastudentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @Autowired
    StudentDao service;

    @GetMapping("/students")
    public StudentDetails getstudents() {
        return service.getAllstudents();
    }

}
