package com.example.springbootsql.teacher.service;

import com.example.springbootsql.employee.model.Employee;
import com.example.springbootsql.employee.repository.EmployeeRepository;
import com.example.springbootsql.teacher.model.*;
import com.example.springbootsql.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Teacher> getTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        return  teachers;
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher createTeacher(TeacherRequest teacher) {
        Teacher newTeacher = new Teacher();
        newTeacher.setFirstNAme(teacher.getFirstNAme());
        newTeacher.setMiddleName(teacher.getMiddleName());
        newTeacher.setLastName(teacher.getLastName());
        newTeacher.setAddress(teacher.getAddress());
        newTeacher.setEmailId(teacher.getEmailId());
        newTeacher.setMobileNo(teacher.getMobileNo());
        return teacherRepository.save(newTeacher);
    }

    @Override
    public TeacherEmployeeResponse createTeacherEmployee(TeacherEmployeeRequest teacherEmployeeRequest) {
        Teacher teacher = new Teacher();
        teacher.setMobileNo(teacherEmployeeRequest.getPhoneNumber());
        teacher.setFirstNAme(teacherEmployeeRequest.getFirstName());
        teacher.setMiddleName(teacherEmployeeRequest.getMiddleName());
        teacher.setLastName(teacherEmployeeRequest.getLastName());
        teacher.setEmailId(teacherEmployeeRequest.getEmail());
        teacher.setAddress(teacherEmployeeRequest.getAddress());

        Teacher createdTeacher = teacherRepository.save(teacher);

        Employee employee = new Employee();
        employee.setFirstName(teacherEmployeeRequest.getFirstName());
        employee.setMiddleName(teacherEmployeeRequest.getMiddleName());
        employee.setLastName(teacherEmployeeRequest.getLastName());
        employee.setAddress(teacherEmployeeRequest.getAddress());
        employee.setMobileNumber(teacherEmployeeRequest.getPhoneNumber());

        Employee createdEmployee = employeeRepository.save(employee);

        TeacherEmployeeResponse teacherEmployeeResponse = new TeacherEmployeeResponse();

        TeacherResponse teacherResponse = new TeacherResponse();
        teacherResponse.setTeacherId(createdTeacher.getId());
        teacherResponse.setFirstName(createdTeacher.getFirstNAme());
        teacherResponse.setMiddleName(createdTeacher.getMiddleName());
        teacherResponse.setEmailAddress(createdTeacher.getEmailId());
        teacherResponse.setMobilePhoneNumber(createdTeacher.getMobileNo());
        teacherResponse.setTeacherAddress(createdTeacher.getAddress());

        teacherEmployeeResponse.setTeacherResponse(teacherResponse);

        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setEmployeeId(createdEmployee.getId());
        employeeResponse.setFirstName(createdEmployee.getFirstName());
        employeeResponse.setMiddleName(createdEmployee.getMiddleName());
        employeeResponse.setLastName(createdEmployee.getLastName());
        employeeResponse.setContactNumber(createdEmployee.getMobileNumber());
        employeeResponse.setAddress(createdEmployee.getAddress());

        teacherEmployeeResponse.setEmployeeResponse(employeeResponse);

        return teacherEmployeeResponse;
    }
}
