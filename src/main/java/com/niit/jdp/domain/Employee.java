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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpoyeeName() {
        return empoyeeName;
    }

    public void setEmpoyeeName(String empoyeeName) {
        this.empoyeeName = empoyeeName;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
