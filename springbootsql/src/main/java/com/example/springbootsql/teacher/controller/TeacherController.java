package com.example.springbootsql.teacher.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {
    @GetMapping("teachers")
    public void getTeachers(){
        System.out.print("Get Mapping");
    }

    @PostMapping("teachers")
    public void postTeacher() {
        System.out.print("Post Mapping");
    }

    @PutMapping("teachers")
    public void putTeacher() {
        System.out.print("Put Mapping");
    }

    @DeleteMapping("teachers")
    public void deleteTeacher() {
        System.out.print("Delete Mapping");
    }
}
