package com.example.springbootsql.student.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping("students")
    public void getStudents() {
        System.out.println("Get Students");
    }
    @PutMapping("students")
    public void putStudents()
    {
        System.out.println("Put Students");
    }
    @PostMapping("students")
    public void postStudents(){
        System.out.println("Post Student");
    }
    @DeleteMapping("students")
    public void deleteStudents(){
        System.out.println("Delete Students");
    }
}
