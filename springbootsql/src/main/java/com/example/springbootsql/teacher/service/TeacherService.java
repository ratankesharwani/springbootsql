package com.example.springbootsql.teacher.service;

import com.example.springbootsql.teacher.model.Teacher;
import com.example.springbootsql.teacher.model.TeacherRequest;
import com.example.springbootsql.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService{

    @Autowired
    private TeacherRepository teacherRepository;
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
}
