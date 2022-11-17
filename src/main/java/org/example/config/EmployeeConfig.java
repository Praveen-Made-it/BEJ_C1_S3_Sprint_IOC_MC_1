/*
 *Author Name:Praveen Kumar
 *Date: 17-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class EmployeeConfig {
    @Bean("employee1")
    // A method which returns an object of type Employee.
    public Employee getEmployee() {
        // Creating an object of type Employee.
        // Calling the getDepartment() method which returns an object of type Department.
        Employee employee = new Employee(getDepartment());
        employee.setEmployeeId(1);
        employee.setEmpoyeeName("Praveen");
        employee.setEmployeeSalary("5_00_000");
        return employee;
    }

    @Bean
    // Creating a bean of type Department.
    public Department getDepartment() {
        return new Department(1, "Developement");
    }

}
