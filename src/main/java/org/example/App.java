package org.example;

import org.example.config.EmployeeConfig;
import org.example.domain.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        // Creating a Spring container and loading the configuration from the EmployeeConfig class.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        // Getting the bean from the Spring container.
        Employee employee = context.getBean("employee1", Employee.class);
        // Printing the employee object.
        System.out.println("employee : " + employee);

    }
}
