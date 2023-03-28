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

    public List<Student> getStudentByCreatedDate(String created_date) {                      //get Student By Created Date
        List<Student> studentList = studentRepository.getStudentByCreatedDate(created_date);
        return studentList;

    }

    public List<Student> getStudentByUpdatedDate(String updated_date) {                      //get Student By Updated Date
        List<Student> studentList = studentRepository.getStudentByUpdatedDate(updated_date);
        return studentList;
    }

    public void deleteStudentById(Integer id) {                             // Delete Student by id
        Student student = studentRepository.getStudentById(id);
        student.setActive(true);
        studentRepository.save(student);
    }

    public void deleteAllStudent() {                  // Delete All
        studentRepository.deleteAllStudent();
    }

    public void deleteStudentByCreatedDate(String created_date){     //delete Student By Created Date
        List<Student> studentList = studentRepository.getStudentByCreatedDate(created_date);
        studentList.stream().forEach(x -> x.setActive(false));
        studentRepository.saveAll(studentList);
    }

    public void deleteStudentsByUpdatedDate(String updated_date){     //delete Students By Updated Date
        List<Student> studentList = studentRepository.getStudentByUpdatedDate(updated_date);
        studentList.stream().forEach(x -> x.setActive(false));
        studentRepository.saveAll(studentList);
    }

    public StringBuilder formatStudentObjectForSlack(Student student){                //format School
        StringBuilder sb =new StringBuilder();
        sb.append("Id-->: *" +student.getId() + "*\n");
        sb.append("Student Name--> *" +student.getStudentName() +"*\n");
        sb.append("Student Age --> *" +student.getStudentAge() +"*\n");
        sb.append("Phone Number --> *" +student.getPhoneNumber() +"*\n");
        sb.append("Created Date--> *" +student.getCreatedDate()+"*\n");
        sb.append("Updated Date--> *" +student.getUpdatedDate() +"*\n");
        sb.append("Is Active --> *" +student.getActive() +"*\n");
        return sb;
    }

    public StringBuilder formatStudentListForSlack(List<Student> studentList){
        StringBuilder mainStringBuilder =new StringBuilder();
        for (Student studentFormatList: studentList){
            mainStringBuilder.append(formatStudentObjectForSlack(studentFormatList));
            mainStringBuilder.append("\n");
        }
        return  mainStringBuilder;
    }

}
