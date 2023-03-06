package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepository;                       //it is referance of interface ,, we can create a object by adding {} ..> schoolRepositry{}

    public List<School> getAllSchools() {
        return schoolRepository.getAllSchools();

    }

    public School getSchoolById(Integer id) {              //get school by id
        School school = schoolRepository.getSchoolById(id);
        return school;
    }

    public School getSchoolByName(String School_name) {                             //get School by School name
        School school = schoolRepository.getSchoolByName(School_name);
        return school;

    }

    public List<School> getAllSchoolsIsActive() {               //get all school is Active
        return schoolRepository.getAllSchoolsIsActive();

    }

    public List<School> getAllSchoolIsInActive() {               //get all school is In Active
        return schoolRepository.getAllSchoolsIsInActive();
    }

    public List<School> getLatestRowInSchool() {                 // get Latest Row in School table
        return schoolRepository.getLatestRow();

    }

    public School updateIsActive(Integer id) {                       //Update is Active
        School school = schoolRepository.updateIsActive(id);
        return school;
    }

    public School getSchoolByCreatedDate(Date createdDate) {                      //get School By Created Date
        School school = schoolRepository.getSchoolByCreatedDate(createdDate);
        return school;
    }

    public School getSchoolByUpdatedDate(Date updatedDate) {                      //get School By updated Date
        School school = schoolRepository.getSchoolByUpdatedDate(updatedDate);
        return school;
    }

    public void deleteSchoolById(Integer id) {                     // Delete by id
        School school = schoolRepository.getSchoolById(id);
        school.setActive(false);
        schoolRepository.save(school);
    }

    public void deleteAllSchool() {                  // Delete All
        schoolRepository.deleteAllSchool();
    }

    public List<School> getSchoolCreatedAfterDate(String StringCreatedDate) throws ParseException {                //get School Created After Date
        DateFormat format = new SimpleDateFormat("yyyy-MM-DD");
        Date date = format.parse(StringCreatedDate);
        List<School> schoolList = schoolRepository.getSchoolCreatedAfterDate(date);
        return schoolList;
    }

    public void deleteSchoolBySchoolName(String schoolName) {                    //delete School By School Name
        School school1 = schoolRepository.getSchoolByName(schoolName);
        school1.setActive(true);
        schoolRepository.save(school1);
    }

     public void deleteSchoolsByCreatedDate(String StringCreatedDate) throws ParseException{     //delete Schools By Created Date
        DateFormat format=new SimpleDateFormat("yyyy-MM-DD");
        Date date=format.parse(StringCreatedDate);
        School school= schoolRepository.getSchoolByCreatedDate(date);
        school.setActive(true);
        schoolRepository.save(school);
    }

    public void deleteSchoolsByUpdatedDate(String StringUpdatedDate) throws ParseException{     //delete Schools By Created Date
        DateFormat format=new SimpleDateFormat("yyyy-MM-DD");
        Date date=format.parse(StringUpdatedDate);
        School school= schoolRepository.getSchoolByUpdatedDate(date);
        school.setActive(true);
        schoolRepository.save(school);
    }

    public void createSchool (String schoolName){                   //create School
        School school=new School();
        school.setSchoolName(schoolName);
        school.setActive(true);
        school.setCreatedDate(new Date());
        schoolRepository.save(school);
    }










//    public void setCreatedDateByUserInput(String stringDate, Integer id) throws ParseException {
//        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
//        Date javaDate=formatter.parse(stringDate);
//        School school=schoolRepository.getSchoolById(id);
//        school.setCreatedDate(javaDate);
//        schoolRepository.save(school);
//    }


}







