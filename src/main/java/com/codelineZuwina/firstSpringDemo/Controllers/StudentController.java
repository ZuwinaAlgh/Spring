package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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

    @RequestMapping(value = "getAllStudentsIsInActive",method = RequestMethod.GET)                         //get all Student is InActive
    public List<Student> getAllStudentsIsInActive(){
        List<Student> studentList= studentService.getAllStudentsIsInActive();
        return studentList;

    }

    @RequestMapping(value = "getLatestRowInStudent",method = RequestMethod.GET)        //get Latest Row in School
    public List<Student> getLatestRowInStudent(){
        List<Student> studentList=studentService.getLatestRowInStudent();
        return studentList;
    }

    @RequestMapping(value = "getStudentCreatedAfterDate" , method = RequestMethod.GET)
    public List<Student> getStudentCreatedAfterDate(@RequestParam String createdDate) throws ParseException {         //get Student Created After Date
        List<Student> studentList=new ArrayList<>();
        studentList=studentService.getStudentCreatedAfterDate(createdDate);
        return studentList;
    }

    @RequestMapping(value = "getStudentByPhoneNumber",method =RequestMethod.GET )                //get By Student Name
    public Student getStudentByPhoneNumber(@RequestParam Integer phoneNumber) {
        Student student= studentService.getStudentByPhoneNumber(phoneNumber);
        return student;
    }

    @RequestMapping(value = "getStudentByCreatedDate",method = RequestMethod.GET)               //get Student By Created Date
    public Student getStudentByCreatedDate(@RequestParam String createdDate)throws ParseException {
        Student student= studentService.getStudentByCreatedDate(createdDate);
        return student;
    }

    @RequestMapping(value = "getStudentByUpdatedDate",method = RequestMethod.GET)                        //get Student By updated Date
    public Student getStudentByUpdatedDate(@RequestParam String updatedDate)throws ParseException {
        Student student= studentService.getStudentByUpdatedDate(updatedDate);
        return student;
    }

    @RequestMapping(value = "deleteStudentById",method = RequestMethod.GET)                                   //delete by Student id
    public void deleteStudentById(@RequestParam Integer id){
        studentService.deleteStudentById(id);
    }


    @RequestMapping(value = "deleteAllStudent", method = RequestMethod.GET)                //delete all Student
    public void deleteAllStudent(){
        studentService.deleteAllStudent();
    }

    @RequestMapping(value = "deleteStudentByCreatedDate", method = RequestMethod.POST)                   //delete Student By Created Date
    public void deleteStudentByCreatedDate(@RequestParam String createdDate) throws ParseException{
        studentService.deleteStudentByCreatedDate(createdDate);
    }

    @RequestMapping(value = "deleteStudentsByUpdatedDate", method = RequestMethod.POST)                   //delete Students By Updated Date
    public void deleteStudentsByUpdatedDate(@RequestParam String updatedDate) throws ParseException{
        studentService.deleteStudentsByUpdatedDate(updatedDate);
    }
}