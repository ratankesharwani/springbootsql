package com.example.springbootsql.teacher.model;

public class TeacherEmployeeResponse {
    private TeacherResponse teacherResponse;
    private EmployeeResponse employeeResponse;

    public TeacherResponse getTeacherResponse() {
        return teacherResponse;
    }

    public void setTeacherResponse(TeacherResponse teacherResponse) {
        this.teacherResponse = teacherResponse;
    }

    public EmployeeResponse getEmployeeResponse() {
        return employeeResponse;
    }

    public void setEmployeeResponse(EmployeeResponse employeeResponse) {
        this.employeeResponse = employeeResponse;
    }
}
