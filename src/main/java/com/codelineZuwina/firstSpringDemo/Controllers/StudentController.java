package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="student")
public class StudentController {

    @Autowired
    StudentService studentService;

    //Student Apis
    @RequestMapping(value = "Student/getAll",method = RequestMethod.GET)
    public List<Student> getAllStudent(){
        List<Student> students= studentService.getAllStudents();
        return students;
    }

    //get student by id
    @RequestMapping(value="student/getById", method =RequestMethod.GET)
    public Student getStudentById(@RequestParam Integer id){
        Student student= studentService.getStudentById(id);
        return student;
    }

    //get student by student name
    @RequestMapping(value = "student/getByStudentName",method =RequestMethod.GET )
    public Student getStudentByStudentName(@RequestParam String student_Name) {
        Student student= studentService.getStudentByStudentName(student_Name);
        return student;
    }

    //get Students by school id
    @RequestMapping(value = "student/getStudentBySchoolName",method = RequestMethod.GET)
    public List<Student>getStudentsBySchoolName(@RequestParam String schoolName){
        return studentService.getStudentsBySchoolName(schoolName);
    }
}
