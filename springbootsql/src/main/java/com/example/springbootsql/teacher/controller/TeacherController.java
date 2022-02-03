package com.example.springbootsql.teacher.controller;

import com.example.springbootsql.teacher.model.Teacher;
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
    public Teacher createTeacher(@RequestBody TeacherRequest teacher) {
        return teacherService.createTeacher(teacher);
    }
}
