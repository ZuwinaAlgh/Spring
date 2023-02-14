package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="mark")
public class MarkController {

    @Autowired
    MarkService markService;

    // Mark Apis
    @RequestMapping(value = "Mark/getAll",method = RequestMethod.GET)
    public List<Mark> getAllMarks(){
        List<Mark> marks= markService.getAllMarks();
        return marks;
    }

    //get mark by id
    @RequestMapping(value="mark/getById", method =RequestMethod.GET)
    public Mark getMarkById(@RequestParam Integer id){
        Mark mark= markService.getMarkById(id);
        return mark   ;
    }


//    @RequestMapping(value = "mark/getMarksByCourseName" ,method = RequestMethod.GET)
//    public List<Mark>getMarksByCourseName(@RequestParam String name){
//    return  markService.getMarksByCourseName(name);
}

