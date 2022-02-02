package com.example.springbootsql.employee.service;

import com.example.springbootsql.employee.model.Employee;
import com.example.springbootsql.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployeeDetatils(Long employeeId, Employee employee) {
        Optional<Employee> oldEmployee = employeeRepository.findById(employeeId);
        if(oldEmployee.isPresent()) {
            Employee updateEmployee = oldEmployee.get();
            if(employee.getAddress()!=null) {
                updateEmployee.setAddress(employee.getAddress());
            }

            if(employee.getFirstName()!=null) {
                updateEmployee.setFirstName(employee.getFirstName());
            }

            if(employee.getMiddleName()!=null) {
                updateEmployee.setMiddleName(employee.getMiddleName());
            }

            if(employee.getLastName()!=null) {
                updateEmployee.setLastName(employee.getLastName());
            }

            if(employee.getMobileNumber()!=null) {
                updateEmployee.setMobileNumber(employee.getMobileNumber());
            }

            return employeeRepository.save(updateEmployee);

        } else {
            return employeeRepository.save(employee);
        }
    }
}
