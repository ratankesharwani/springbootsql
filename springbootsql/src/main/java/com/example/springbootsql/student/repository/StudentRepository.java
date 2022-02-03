package com.example.springbootsql.student.repository;

import com.example.springbootsql.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
