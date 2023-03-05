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
    public List<School> getAllSchools(){
        return schoolRepository.getAllSchools();

    }

    public School getSchoolById(Integer id){              //get school by id
        School school=schoolRepository.getSchoolById(id);
        return school;
    }

    public School getSchoolByName(String School_name){                             //get School by School name
        School school=schoolRepository.getSchoolByName(School_name);
        return school;

    }

    public List<School> getAllSchoolsIsActive() {               //get all school is Active
        return  schoolRepository.getAllSchoolsIsActive();

    }

    public List<School> getAllSchoolIsInActive(){               //get all school is In Active
        return  schoolRepository.getAllSchoolsIsInActive();
    }

    public List<School> getLatestRowInSchool(){                 // get Latest Row in School table
        return  schoolRepository.getLatestRow();

    }

    public School updateIsActive(Integer id){                       //Update is Active
        School school=schoolRepository.updateIsActive(id);
        return school;
    }

    public School getSchoolByCreatedDate(Date createdDate){                      //get School By Created Date
        School school=schoolRepository.getSchoolByCreatedDate(createdDate);
        return school;
    }

//    public void setCreatedDateByUserInput(String stringDate, Integer id) throws ParseException {
//        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
//        Date javaDate=formatter.parse(stringDate);
//        School school=schoolRepository.getSchoolById(id);
//        school.setCreatedDate(javaDate);
//        schoolRepository.save(school);
//    }


//    public School deleteSchoolById(Integer id){                     // Delete by id
//        School school=schoolRepository.deleteSchoolById(id);
//        return  school;
//    }


//    public List<School> deleteAllSchool(){                             // Delete All
//        return schoolRepository.deleteAllSchool();
//
//    }

//    public School deleteSchoolByColumnName(String schoolName){                     // //deleteBy<Column Name>
//        School school1=schoolRepository.deleteSchoolByColumnName(schoolName);
//        return school1;
//    }





}
