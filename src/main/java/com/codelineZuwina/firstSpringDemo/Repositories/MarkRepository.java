package com.codelineZuwina.firstSpringDemo.Repositories;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Models.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends CrudRepository<Mark,Integer> {

    @Query(value="SELECT m from Mark m")
    List<Mark> getAllMarks();
}
