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

@RestController                             //controll that link (localhost:8080/school/getAll)
                                           //localhost...> means this localhost running in my server using one port 8080
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
    public School getSchoolById(@RequestParam Integer id){                          //@RequestParm(veraible come from the link that used it)
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
    @RequestMapping(value = "getAllSchoolIsActive",method = RequestMethod.GET)
    public List<School> getAllSchoolsIsActive(){
        List<School> schoolList= schoolService.getAllSchoolsIsActive();
        return schoolList;

    }

    //get All Schools is In Active
    @RequestMapping(value = "getAllSchoolsIsInActive",method = RequestMethod.GET)
    public  List<School> getAllSchoolsIsInActive(){
        List<School>schoolList=schoolService.getAllSchoolIsInActive();
        return schoolList;
    }

    //get Latest Row in School
    @RequestMapping(value = "getLatestRowSchool",method = RequestMethod.GET)
    public List<School> getLatestRowInSchool(){
        List<School> school=schoolService.getLatestRowInSchool();
        return school;
    }

    // Update is Active
    @RequestMapping(value = "updateIsActive",method = RequestMethod.GET)
    public School updateIsActive(@RequestParam Integer id) {
        School school= schoolService.updateIsActive(id);
        return school;
    }
    @RequestMapping(value = "deleteSchoolById",method = RequestMethod.GET)
    public School deleteSchoolById(@RequestParam Integer id){
        School school=schoolService.deleteSchoolById(id);
        return school;
    }
    @RequestMapping(value = "deleteAllSchool", method = RequestMethod.GET)
    public List<School> deleteAll(){
        List<School> schoolList=schoolService.deleteAllSchool();
        return schoolList;
    }


}
