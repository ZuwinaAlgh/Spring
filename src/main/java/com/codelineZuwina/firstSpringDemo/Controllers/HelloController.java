package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Service.CourseService;
import com.codelineZuwina.firstSpringDemo.Service.MarkService;
import com.codelineZuwina.firstSpringDemo.Service.SchoolService;
import com.codelineZuwina.firstSpringDemo.Service.StudentService;
import com.codelineZuwina.firstSpringDemo.Slack.SlackClient;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    SlackClient slackClient;

    @GetMapping(value="slackMessage")
    public void message(@RequestParam String text) {
        slackClient.sendMessage(text);
    }
}

































