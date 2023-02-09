package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String returnStringHello(){

        return "hello Zuwina";
    }
@GetMapping(value="mayName")
    public String printName(String firstName,String lastName){
         firstName="Zuwina";
         lastName="Alghafri";
         return "May name"+firstName+lastName;

    }




}
