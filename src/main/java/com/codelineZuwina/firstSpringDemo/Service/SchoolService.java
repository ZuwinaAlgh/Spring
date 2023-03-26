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

    public List<School> getSchoolByCreatedDate(String created_date) {                      //get School By Created Date
        List<School> schoolList = schoolRepository.getSchoolByCreatedDate(created_date);
        return schoolList;
    }

    public List<School> getSchoolByUpdatedDate(String updated_date) {                      //get School By updated Date
        List<School> schoolList = schoolRepository.getSchoolByUpdatedDate(updated_date);
        return schoolList;
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

     public void deleteSchoolsByCreatedDate(String created_date){     //delete Schools By Created Date
         List<School> schoolList = schoolRepository.getSchoolByCreatedDate(created_date);
         schoolList.stream().forEach(x -> x.setActive(false));
         schoolRepository.saveAll(schoolList);
    }

    public void deleteSchoolsByUpdatedDate(String updated_date){     //delete Schools By Updated Date
        List<School> schoolList = schoolRepository.getSchoolByCreatedDate(updated_date);
        schoolList.stream().forEach(x -> x.setActive(false));
        schoolRepository.saveAll(schoolList);
    }

    public void createSchool (String schoolName){                   //create School
        School school=new School();
        school.setSchoolName(schoolName);
        school.setActive(true);
        school.setCreatedDate(new Date());
        schoolRepository.save(school);
    }

    public void updateSchool (Integer id,String schoolName, boolean isActive){                          //Update School
        School school=schoolRepository.getSchoolById(id);
        school.setSchoolName(schoolName);
        school.setActive(true);
        school.setCreatedDate(new Date());
        schoolRepository.save(school);

    }

    public void deleteAllSchoolsCreatedAfterDate(String createdDate)throws ParseException{
        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(createdDate);
        List<School> schoolList =schoolRepository.deleteAllSchoolsCreatedAfterDate(date);
        schoolList.stream().forEach(x -> x.setActive(false));
        schoolRepository.saveAll(schoolList);
    }

    public StringBuilder formatSchoolObjectForSlack(School school){                //format School
        StringBuilder sb =new StringBuilder();
        sb.append("Id-->: *" +school.getId() + "*\n");
        sb.append("School Name--> *" +school.getSchoolName() +"*\n");
        sb.append("Created Date --> *" +school.getCreatedDate() +"*\n");
        sb.append("Updated Date--> *" +school.getUpdatedDate() +"*\n");
        sb.append("Is Active --> *" +school.getActive() +"*\n");
        return sb;
    }

    public StringBuilder formatSchoolListForSlack(List<School> schoolList){
        StringBuilder mainStringBuilder =new StringBuilder();
        for (School schoolFormatList: schoolList){
            mainStringBuilder.append(formatSchoolObjectForSlack(schoolFormatList));
            mainStringBuilder.append("\n");
        }
        return  mainStringBuilder;
    }








}







