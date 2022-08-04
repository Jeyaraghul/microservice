package com.example.springeurekastudentservice;

import org.springframework.stereotype.Service;

@Service
public class StudentDao {
    static StudentDetails studentDetails = new StudentDetails();

    static {
        studentDetails.getEmployeelist().add(new Student(12, "ram"));
        studentDetails.getEmployeelist().add(new Student(22, "vijay"));

    }

    public StudentDetails getAllstudents() {
        return studentDetails;

    }

}
