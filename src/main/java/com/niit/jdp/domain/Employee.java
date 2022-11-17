/*
 *Author Name:Praveen Kumar
 *Date: 17-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.domain;

public class Employee {
    private int employeeId;
    private String empoyeeName;
    private String employeeSalary;

    public Employee() {
    }

    public Employee(int employeeId, String empoyeeName, String employeeSalary) {
        this.employeeId = employeeId;
        this.empoyeeName = empoyeeName;
        this.employeeSalary = employeeSalary;
    }
}
