package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
     SchoolRepository schoolRepository;
    public List<School> getAllSchools(){
        return schoolRepository.getAllSchools();

    }

    public School getSchoolById(Integer id){              //get school by id
        School school=schoolRepository.getSchoolById(id);
        return school;
    }

    public School getSchoolByName(String School_name){
        School school=schoolRepository.getSchoolByName(School_name);
        return school;

    }

    //get all school is Active
    public List<School> getAllSchoolsIsActive() {
        return  schoolRepository.getAllSchoolsIsActive();

    }

    //get all school is In Active
    public List<School> getAllSchoolIsInActive(){
        return  schoolRepository.getAllSchoolsIsInActive();
    }

    // get Latest Row in School table
    public List<School> getLatestRowInSchool(){
        return  schoolRepository.getLatestRow();

    }





}
