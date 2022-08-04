package com.zaga.employeeservice;

import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {
    static EmployeeDetails employeeDetails = new EmployeeDetails();

    static {
        employeeDetails.getEmployeelist().add(new Employee(12, "ram"));
        employeeDetails.getEmployeelist().add(new Employee(22, "vijay"));

    }

    public EmployeeDetails getAllemployees() {
        return employeeDetails;

    }

}
