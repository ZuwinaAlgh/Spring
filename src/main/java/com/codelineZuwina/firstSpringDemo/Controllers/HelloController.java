package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Service.CourseService;
import com.codelineZuwina.firstSpringDemo.Service.MarkService;
import com.codelineZuwina.firstSpringDemo.Service.SchoolService;
import com.codelineZuwina.firstSpringDemo.Service.StudentService;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //get school by id
    @RequestMapping(value="school/getById", method =RequestMethod.GET)
    public School getSchoolById(@RequestParam Integer id){
    School school=schoolService.getSchoolById(id);
    return school;


    }

    //get student by id
    @RequestMapping(value="student/getById", method =RequestMethod.GET)
    public Student getStudentById(@RequestParam Integer id){
        Student student= studentService.getStudentById(id);
        return student;
    }

    //get course by id
    @RequestMapping(value="course/getById", method =RequestMethod.GET)
    public Course getCourseById(@RequestParam Integer id){
        Course course= courseService.getCourseById(id);
        return course;
    }

    //get mark by id
    @RequestMapping(value="mark/getById", method =RequestMethod.GET)
    public Mark getMarkById(@RequestParam Integer id){
        Mark mark= markService.getMarkById(id);
        return mark   ;
    }

    //get student by student name
    @RequestMapping(value = "student/getByStudentName",method =RequestMethod.GET )
    public Student getStudentByStudentName(@RequestParam String student_Name) {
        Student student= studentService.getStudentByStudentName(student_Name);
        return student;
    }

    //get School by School name
    @RequestMapping(value = "school/getBySchoolName",method = RequestMethod.GET)
    public School getSchoolByName(@RequestParam String School_name) {
        School school= schoolService.getSchoolByName(School_name);
        return school;
    }

    //get Course by Course name
    @RequestMapping(value = "course/getByCourseName",method = RequestMethod.GET)
    public Course getCourseByCourseName(@RequestParam String course_name) {
        Course course= courseService.getCourseByCourseName(course_name);
        return course;
    }







}
