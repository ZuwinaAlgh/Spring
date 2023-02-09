package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Service.CourseService;
import com.codelineZuwina.firstSpringDemo.Service.MarkService;
import com.codelineZuwina.firstSpringDemo.Service.SchoolService;
import com.codelineZuwina.firstSpringDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    StudentService studentService;
    @Autowired
    SchoolService schoolService;
    @Autowired
    CourseService courseService;
    @Autowired
    MarkService markService;

    //school Apis
@RequestMapping(value = "school/getAll",method = RequestMethod.GET)
public List<School> getAllSchools(){
    List<School> schools= schoolService.getAllSchools();
    return schools;
}

     //Student Apis
@RequestMapping(value = "Student/getAll",method = RequestMethod.GET)
    public List<Student> getAllStudent(){
        List<Student> students= studentService.getAllStudents();
        return students;
    }

    // Course Apis
    @RequestMapping(value = "Course/getAll",method = RequestMethod.GET)
    public List<Course> getAllCourse(){
        List<Course> courses= courseService.getAllCourse();
        return courses;
    }

   // Mark Apis
    @RequestMapping(value = "Mark/getAll",method = RequestMethod.GET)
    public List<Mark> getAllMarks(){
        List<Mark> marks= markService.getAllMarks();
        return marks;
    }







}
