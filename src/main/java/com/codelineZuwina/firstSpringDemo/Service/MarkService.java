package com.codelineZuwina.firstSpringDemo.Service;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Repositories.CourseRepository;
import com.codelineZuwina.firstSpringDemo.Repositories.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService {
    @Autowired
    MarkRepository markRepository;
    public List<Mark> getAllMarks(){

        return markRepository.getAllMarks();
    }

    public Mark getMarkById(Integer id){
        Mark mark=markRepository.getMarkById(id);
        return mark;
    }

}
