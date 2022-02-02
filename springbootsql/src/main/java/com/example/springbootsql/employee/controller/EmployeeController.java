package com.example.springbootsql.employee.controller;

import com.example.springbootsql.employee.model.Employee;
import com.example.springbootsql.employee.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
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

    @PutMapping("{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") Long employeeId, @RequestBody Employee employee) {
        System.out.print("update Employee");
       Employee updatedEmployeeDetails = employeeService.updateEmployeeDetatils(employeeId,employee);
       return updatedEmployeeDetails;
    }

    @DeleteMapping("{employeeId}")
    public Boolean deleteEmployee(@PathVariable("employeeId") Long employeeId) {
        Boolean deleted = employeeService.deleteEmployee(employeeId);
        return deleted;
    }
}
