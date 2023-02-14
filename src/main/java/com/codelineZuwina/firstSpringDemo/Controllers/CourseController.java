package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="course")
public class CourseController {

    @Autowired
    CourseService courseService;

    // Course Apis
    @RequestMapping(value = "Course/getAll",method = RequestMethod.GET)
    public List<Course> getAllCourse(){
        List<Course> courses= courseService.getAllCourse();
        return courses;
    }

    //get course by id
    @RequestMapping(value="course/getById", method =RequestMethod.GET)
    public Course getCourseById(@RequestParam Integer id){
        Course course= courseService.getCourseById(id);
        return course;
    }

    //get Course by Course name
    @RequestMapping(value = "course/getByCourseName",method = RequestMethod.GET)
    public Course getCourseByCourseName(@RequestParam String course_name) {
        Course course= courseService.getCourseByCourseName(course_name);
        return course;
    }

    @RequestMapping(value= "course/getCourseByStudentName",method = RequestMethod.GET)
    public List<Course>getCourseByStudentName(@RequestParam String studentName){
        return  courseService.getCoursesByStudentName(studentName);
    }
}
