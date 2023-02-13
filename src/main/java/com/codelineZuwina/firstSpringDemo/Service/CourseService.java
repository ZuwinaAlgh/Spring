package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Repositories.CourseRepository;
import com.codelineZuwina.firstSpringDemo.Repositories.SchoolRepository;
import com.codelineZuwina.firstSpringDemo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public SchoolRepository getSchoolRepository() {
        return schoolRepository;
    }

    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    StudentRepository studentRepository;
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

    public List<Course> getCoursesByStudentName(String studentName){              //get course by student id
        Student student=studentRepository.getStudentByStudentName(studentName);
        Integer studentId=student.getId();
        List<Course> courseListList=courseRepository.getCourseBySchoolId(studentId);
        return  courseListList;
    }



}
