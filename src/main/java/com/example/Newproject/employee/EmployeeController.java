package com.example.Newproject.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration

public class EmployeeController {
    @RequestMapping("/test")
    public List<Employee> getEmployeeList() {
        Employee employee1 = new Employee(0, "小明", 20, "男");
        Employee employee2 = new Employee(1, "小红", 19, "女");
        Employee employee3 = new Employee(2, "小智", 15, "男");
        Employee employee4 = new Employee(3, "小刚", 16, "男");
        Employee employee5 = new Employee(4, "小霞", 15, "女");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        return employees;
    }
    public static void main(String[] args) {
        SpringApplication.run(EmployeeController.class,args);
    }
}
