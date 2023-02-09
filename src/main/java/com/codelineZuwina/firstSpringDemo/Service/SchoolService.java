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
}
