package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.RequestObject.SchoolRequestForCreateDateUpdate;
import com.codelineZuwina.firstSpringDemo.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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

    @RequestMapping(value = "school/getBySchoolName",method = RequestMethod.GET)                     //get School by School name
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

    @RequestMapping(value = "getAllSchoolsIsInActive",method = RequestMethod.GET)       //get All Schools is In Active
    public  List<School> getAllSchoolsIsInActive(){
        List<School>schoolList=schoolService.getAllSchoolIsInActive();
        return schoolList;
    }


    @RequestMapping(value = "getLatestRowSchool",method = RequestMethod.GET)        //get Latest Row in School
    public List<School> getLatestRowInSchool(){
        List<School> school=schoolService.getLatestRowInSchool();
        return school;
    }

    @RequestMapping(value = "updateIsActive",method = RequestMethod.GET)              //  Update is Active
    public School updateIsActive(@RequestParam Integer id) {
        School school= schoolService.updateIsActive(id);
        return school;
    }

    @RequestMapping(value = "getSchoolByCreatedDate",method = RequestMethod.GET)               //get School By Created Date
    public School getSchoolByCreatedDate(@RequestParam Date createdDate) {
        School school= schoolService.getSchoolByCreatedDate(createdDate);
        return school;
    }

    @RequestMapping(value = "school/getSchoolByUpdatedDate",method = RequestMethod.GET)               //get School By updated date
    public School getSchoolByUpdatedDate(@RequestParam Date updatedDate) {
        School school= schoolService.getSchoolByUpdatedDate(updatedDate);
        return school;
    }

    @RequestMapping(value = "deleteSchoolById",method = RequestMethod.GET)             //delete by School id
    public void deleteSchoolById(@RequestParam Integer id){
        schoolService.deleteSchoolById(id);
    }

    @RequestMapping(value = "deleteAllSchool", method = RequestMethod.GET)                //delete all school
    public void deleteAll(){
       schoolService.deleteAllSchool();
    }
    @RequestMapping(value = "getSchoolCreatedAfterDate" , method = RequestMethod.GET)
    public List<School> getSchoolCreatedAfterDate(@RequestParam String createdDate) throws ParseException{         //get School Created After Date
        List<School> schoolList=new ArrayList<>();
        schoolList=schoolService.getSchoolCreatedAfterDate(createdDate);
        return schoolList;
    }

    @RequestMapping(value = "deleteSchoolBySchoolName",method = RequestMethod.GET)             //delete School by School name
    public void deleteSchoolBySchoolName(@RequestParam String schoolName) {
     schoolService.deleteSchoolBySchoolName(schoolName);
    }
    @RequestMapping(value = "deleteSchoolsByCreatedDate", method = RequestMethod.POST)                   //delete Schools By Created Date
    public void deleteSchoolsByCreatedDate(@RequestParam String createdDate) throws ParseException{
        schoolService.deleteSchoolsByCreatedDate(createdDate);
    }

    @RequestMapping(value = "deleteSchoolsByUpdatedDate", method = RequestMethod.POST)                   //delete Schools By Created Date
    public void deleteSchoolsByUpdatedDate(@RequestParam String updatedDate) throws ParseException{
        schoolService.deleteSchoolsByUpdatedDate(updatedDate);
    }
    @RequestMapping(value = "createSchool" , method = RequestMethod.POST)               //create School
    public void createSchool(@RequestParam String schoolName) {
        schoolService.createSchool(schoolName);
    }
    @RequestMapping(value = "updateSchool", method = RequestMethod.POST)
    public void updateSchool(@RequestParam Integer id, String schoolName, boolean isActive){                 //updated School
        schoolService.updateSchool(id,schoolName,isActive);
    }






//    @RequestMapping(value="UpdateCreatedDateByUserInput")
//           public void setCreatedDateByUserInput(@RequestParam SchoolRequestForCreateDateUpdate data) throws ParseException {
//        schoolService.setCreatedDateByUserInput(data.getDate(), data.getId());
//    }









}
