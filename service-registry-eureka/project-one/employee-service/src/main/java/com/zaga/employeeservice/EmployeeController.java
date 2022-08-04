package com.zaga.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeDao service;

    @GetMapping("/employees")
    public EmployeeDetails getemployees() {
        return service.getAllemployees();
    }

}
