package com.example.springeurekastudentservice;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

    List<Student> studentList;

    public List<Student> getEmployeelist() {
        if (studentList == null) {
            studentList = new ArrayList<Student>();
        }
        return studentList;
    }

    public void setEmployeelist(List<Student> studentList) {
        this.studentList = studentList;
    }
}
