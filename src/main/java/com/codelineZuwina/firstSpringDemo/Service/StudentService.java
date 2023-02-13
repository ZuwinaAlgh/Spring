package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.getAllStudent();
}

    public Student getStudentById(Integer id){
        Student student=studentRepository.getStudentById(id);
        return student;
    }

  public Student getStudentByStudentName(String student_Name){
        Student student=studentRepository.getStudentByStudentName(student_Name);
        return student;
  }



}
