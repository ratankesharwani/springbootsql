package com.example.springbootsql.employee.service;

import com.example.springbootsql.employee.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployees();

    Employee createEmployee(Employee employee);

    Employee updateEmployeeDetatils(Long employeeId, Employee employee);

    Boolean deleteEmployee(Long employeeId);

    List<Employee> createEmployee(List<Employee> employees);
}
