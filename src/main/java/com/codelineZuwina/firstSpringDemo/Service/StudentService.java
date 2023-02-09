package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(){
        Student student = new Student();
        student.setStudentName("Lamiya");
        student.setStudentAge(25);
        student.setPhoneNumber(2564132);
        student.setEmail("lamiya@hotmail.com");
        studentRepository.save(student);


    }

}
