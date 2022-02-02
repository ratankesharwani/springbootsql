package com.example.springbootsql.employee.controller;

import com.example.springbootsql.employee.model.Employee;
import com.example.springbootsql.employee.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping()
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.getEmployees();
        return employees;
    }

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee employee) {
       Employee createdEmployee = employeeService.createEmployee(employee);
       return createdEmployee;
    }

    @PutMapping()
    public void updateEmployee() {
        System.out.print("update Employee");
    }

    @DeleteMapping()
    public void deleteEmployee() {
        System.out.print("delete Employee");
    }
}
