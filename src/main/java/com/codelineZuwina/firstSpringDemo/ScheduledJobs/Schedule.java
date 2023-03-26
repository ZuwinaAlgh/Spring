package com.codelineZuwina.firstSpringDemo.ScheduledJobs;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Service.CourseService;
import com.codelineZuwina.firstSpringDemo.Service.MarkService;
import com.codelineZuwina.firstSpringDemo.Service.SchoolService;
import com.codelineZuwina.firstSpringDemo.Service.StudentService;
import com.codelineZuwina.firstSpringDemo.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
public class Schedule {
    @Autowired
    SlackClient slackClient;
    @Autowired
    SchoolService schoolService;
    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;
    @Autowired
    MarkService markService;
        @Scheduled(cron= "0 15 * * * * ")
        @RequestMapping(value = "getAll",method = RequestMethod.GET)
        public List<School> getAllSchools(){
            List<School> schools= schoolService.getAllSchools();
            for(School school: schools) {
                slackClient.sendMessage(school.getId().toString());
                slackClient.sendMessage(school.getSchoolName().toString());
                slackClient.sendMessage(school.getCreatedDate().toString());
                slackClient.sendMessage(school.getUpdatedDate().toString());
                slackClient.sendMessage(school.getActive().toString());
            }
            return schools;
    }

    @Scheduled(cron= "0 0/15 * * * * ")
    @RequestMapping(value = "getLatestRowInStudent",method = RequestMethod.GET)
    public List<Student> getLatestRowInStudent(){
        List<Student> studentList=studentService.getLatestRowInStudent();
        for (Student student:studentList){
            slackClient.sendMessage(student.getId().toString());
            slackClient.sendMessage(student.getStudentAge().toString());
            slackClient.sendMessage(student.getEmail().toString());
            slackClient.sendMessage(student.getPhoneNumber().toString());
            slackClient.sendMessage(student.getCreatedDate().toString());
            slackClient.sendMessage(student.getUpdatedDate().toString());
        }
        return studentList;
    }

    @Scheduled(cron= "0 0/15 * * * * ")
    @RequestMapping(value = "Course/getAll",method = RequestMethod.GET)
    public List<Course> getAllCourse(){
        List<Course> courses= courseService.getAllCourse();
        return courses;
    }

    @Scheduled(cron= "0 0/15 * * * * ")
    @RequestMapping(value = "Mark/getAll",method = RequestMethod.GET)
    public List<Mark> getAllMarks(){
        List<Mark> marks= markService.getAllMarks();
        return marks;
    }



}
