package com.example.springbootsql.student.service;

import com.example.springbootsql.student.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IStudentService {
    List<Student> getStudent();
    Student postStudents(Student student);


    Student putStudents(Long studentId, Student student);

    boolean deleteStudent(Long studentId);

    Student getSpecificStudent(Long studentId);

    List<Student> getStudentByIds(Set<Long> studentIds);
}
