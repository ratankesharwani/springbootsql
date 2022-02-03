package com.example.springbootsql.student.service;
import com.example.springbootsql.student.model.Student;
import com.example.springbootsql.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student postStudents(Student student) {
        return studentRepository.save(student);
    }



    @Override
    public Student putStudents(Long studentId, Student student) {
        Optional<Student> oldStudent = studentRepository.findById(studentId);
        if(oldStudent.isPresent()){
            Student oldStudentDetails = oldStudent.get();
            if(student.getFirstName()!=null){
                oldStudentDetails.setFirstName(student.getFirstName());
            }
            if(student.getMiddleName()!=null){
                oldStudentDetails.setMiddleName(student.getMiddleName());
            }
            if(student.getLastName()!=null){
                oldStudentDetails.setLastName(student.getLastName());
            }
            if(student.getAddress()!=null){
                oldStudentDetails.setAddress(student.getAddress());
            }
            if(student.getPhoneNo()!=null){
                oldStudentDetails.setPhoneNo(student.getPhoneNo());
            }
            if(student.getEmailId()!=null){
                oldStudentDetails.setEmailId(student.getEmailId());
            }
            return studentRepository.save(oldStudentDetails);
        }
        return studentRepository.save(student);
    }

    @Override
    public boolean deleteStudent(Long studentId) {
        Optional<Student> olsStudentDetails = studentRepository.findById(studentId);
        if(olsStudentDetails.isPresent()){
            studentRepository.delete(olsStudentDetails.get());
            return true;
        }else{

        return false;
    }


}

    @Override
    public Student getSpecificStudent(Long studentId) {
        Optional<Student> oldStudent = studentRepository.findById(studentId);
        if(oldStudent.isPresent()){
            return oldStudent.get();
        }
        else {
            return null;
        }
    }
}
