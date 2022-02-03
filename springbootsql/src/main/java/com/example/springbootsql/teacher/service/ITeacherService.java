package com.example.springbootsql.teacher.service;

import com.example.springbootsql.teacher.model.Teacher;
import com.example.springbootsql.teacher.model.TeacherRequest;

import java.util.List;

public interface ITeacherService {
    List<Teacher> getTeachers();

    Teacher createTeacher(TeacherRequest teacher);
}
