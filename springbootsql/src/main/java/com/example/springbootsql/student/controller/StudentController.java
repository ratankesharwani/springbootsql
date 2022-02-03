package com.example.springbootsql.student.controller;

import com.example.springbootsql.student.model.Student;
import com.example.springbootsql.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/v0/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping()
    public List<Student> getStudents() {
        List<Student> student = studentService.getStudent();
        return student;
    }
    @PutMapping("{studentId}")
    public Student putStudent(@PathVariable("studentId") Long studentId , @RequestBody Student student) {
     Student putStudent = studentService.putStudents(studentId,student);
     return putStudent;
    }

    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable("studentId") Long studentId){
        Student student = studentService.getSpecificStudent(studentId);
        return student;
    }

    @GetMapping("ids/{studentIds}")
    public List<Student> getStudents(@PathVariable("studentIds") Set<Long> studentIds){
        List<Student> student = studentService.getStudentByIds(studentIds);
        return student;
    }



    @PostMapping()
    public Student postStudents(@RequestBody Student student){
        Student postStudents = studentService.postStudents(student);
        return postStudents;
    }
    @DeleteMapping("{studentId}")
    public boolean deleteStudents(@PathVariable("studentId") Long studentId){
        boolean deletedStudent = studentService.deleteStudent(studentId);
        return deletedStudent;
    }
}
