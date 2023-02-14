package com.codelineZuwina.firstSpringDemo.Repositories;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.Mark;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends CrudRepository<Mark,Integer> {

    @Query(value="SELECT m from Mark m")
    List<Mark> getAllMarks();

    @Query(value="SELECT s from Mark s Where s.id = :id")
    Mark getMarkById(@Param("id") Integer id);

//    @Query(value="SELECT m from Mark m Where m.course.id= :id")
//    List<Mark> getMarksByCourseId(@Param("id") Integer id);
}
