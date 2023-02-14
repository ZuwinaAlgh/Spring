package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    //school Apis
    @RequestMapping(value = "school/getAll",method = RequestMethod.GET)
    public List<School> getAllSchools(){
        List<School> schools= schoolService.getAllSchools();
        return schools;
    }

    //get school by id
    @RequestMapping(value="school/getById", method =RequestMethod.GET)
    public School getSchoolById(@RequestParam Integer id){
        School school=schoolService.getSchoolById(id);
        return school;

    }

    //get School by School name
    @RequestMapping(value = "school/getBySchoolName",method = RequestMethod.GET)
    public School getSchoolByName(@RequestParam String School_name) {
        School school= schoolService.getSchoolByName(School_name);
        return school;
    }

    //get all school is active
    @RequestMapping(value = "school/getAllSchoolIsActive",method = RequestMethod.GET)
    public List<School> getAllSchoolsIsActive(){
        List<School> schoolList= schoolService.getAllSchoolsIsActive();
        return schoolList;

    }
}
