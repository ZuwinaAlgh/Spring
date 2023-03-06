package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.School;
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
    @RequestMapping(value = "Student/getAll",method = RequestMethod.GET)                 //get All
    public List<Student> getAllStudent(){
        List<Student> students= studentService.getAllStudents();
        return students;
    }

    //get student by id
    @RequestMapping(value="student/getById", method =RequestMethod.GET)                   // get Student by id
    public Student getStudentById(@RequestParam Integer id){
        Student student= studentService.getStudentById(id);
        return student;
    }

    //get student by student name
    @RequestMapping(value = "student/getByStudentName",method =RequestMethod.GET )                //get By Student Name
    public Student getStudentByStudentName(@RequestParam String student_Name) {
        Student student= studentService.getStudentByStudentName(student_Name);
        return student;
    }

    //get Students by school id
    @RequestMapping(value = "student/getStudentBySchoolName",method = RequestMethod.GET)            // get Student by School Name
    public List<Student>getStudentsBySchoolName(@RequestParam String schoolName){
        return studentService.getStudentsBySchoolName(schoolName);
    }

    @RequestMapping(value = "getAllStudentsIsActive",method = RequestMethod.GET)                         //get all Student is active
    public List<Student> getAllStudentsIsActive(){
        List<Student> studentList= studentService.getAllStudentsIsActive();
        return studentList;

    }
}
