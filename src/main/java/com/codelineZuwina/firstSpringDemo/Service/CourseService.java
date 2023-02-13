package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Repositories.CourseRepository;
import com.codelineZuwina.firstSpringDemo.Repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;
    public List<Course> getAllCourse(){

        return courseRepository.getAllCourse();
}

    public Course getCourseById(Integer id){
        Course course=courseRepository.getCourseById(id);
        return course;
    }

    public Course getCourseByCourseName(String course_name){
        Course course=courseRepository.getCourseByName(course_name);
        return course;
    }



}
