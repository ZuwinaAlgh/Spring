package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import com.codelineZuwina.firstSpringDemo.Repositories.SchoolRepository;
import com.codelineZuwina.firstSpringDemo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    SchoolRepository schoolRepository;

    public List<Student> getAllStudents(){                   //get All
        return studentRepository.getAllStudent();
    }

    public Student getStudentById(Integer id){                         // get Student by id
        Student student=studentRepository.getStudentById(id);
        return student;
    }

    public Student getStudentByStudentName(String student_Name){                        //get By Student Name
        Student student=studentRepository.getStudentByStudentName(student_Name);
        return student;
    }


    public List<Student> getStudentsBySchoolName(String schoolName){    //get students by school name
        School school=schoolRepository.getSchoolByName(schoolName);
        Integer schoolId=school.getId();
        List<Student> studentList=studentRepository.getStudentBySchoolId(schoolId);
        return  studentList;
    }

    public List<Student> getAllStudentsIsActive() {                          //get all Student is Active
        return studentRepository.getAllStudentsIsActive();

    }

    public List<Student> getAllStudentsIsInActive() {                          //get all Student is InActive
        return studentRepository.getAllStudentsIsInActive();

    }

    public List<Student> getLatestRowInStudent() {                            // get Latest Row in Student table
        return studentRepository.getLatestRowInStudent();

    }

    public List<Student> getStudentCreatedAfterDate(String StringCreatedDate) throws ParseException {                //get Student Created After Date
        DateFormat format = new SimpleDateFormat("yyyy-MM-DD");
        Date date = format.parse(StringCreatedDate);
        List<Student> studentList = studentRepository.getStudentCreatedAfterDate(date);
        return studentList;
    }

    public Student getStudentByPhoneNumber(Integer phoneNumber){                        //get By Student by Student Email
        Student student=studentRepository.getStudentByPhoneNumber(phoneNumber);
        return student;
    }

    public Student getStudentByCreatedDate(String createdDate) throws ParseException {                      //get Student By Created Date
        DateFormat format = new SimpleDateFormat("yyyy-MM-DD");
        Date date = format.parse(createdDate);
        Student student=studentRepository.getStudentByCreatedDate(date);
        return student;
    }

}
