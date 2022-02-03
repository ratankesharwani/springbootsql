package com.example.springbootsql.teacher.controller;

import com.example.springbootsql.teacher.model.Teacher;
import com.example.springbootsql.teacher.model.TeacherEmployeeRequest;
import com.example.springbootsql.teacher.model.TeacherEmployeeResponse;
import com.example.springbootsql.teacher.model.TeacherRequest;
import com.example.springbootsql.teacher.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/teachers")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @GetMapping
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody TeacherRequest teacherRequest) {
        Teacher createdTeacher = teacherService.createTeacher(teacherRequest);
        return createdTeacher;
    }


    @PostMapping("teacher-employee")
    public TeacherEmployeeResponse createTeacherEmployee(@RequestBody TeacherEmployeeRequest teacherEmployeeRequest) {
        TeacherEmployeeResponse teacherEmployeeResponse = teacherService.createTeacherEmployee(teacherEmployeeRequest);
        return teacherEmployeeResponse;
    }


}
