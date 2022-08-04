package com.zaga.employeeservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
    List<Employee> employeelist;

    public List<Employee> getEmployeelist() {
        if (employeelist == null) {
            employeelist = new ArrayList<Employee>();
        }
        return employeelist;
    }

    public void setEmployeelist(List<Employee> employeelist) {
        this.employeelist = employeelist;
    }

}
