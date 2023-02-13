package com.codelineZuwina.firstSpringDemo.Repositories;

import com.codelineZuwina.firstSpringDemo.Models.Course;
import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer> {

    @Query(value="SELECT s from Course s")
    List<Course> getAllCourse();

    @Query(value="SELECT s from Course s Where s.id = :id")
    Course getCourseById(@Param("id") Integer id);

    @Query(value = "SELECT s from Course s Where s.name = :name")
    Course getCourseByName(@Param("name") String name);

    @Query(value="SELECT cr from Course cr Where cr.student.id= :id")
    List<Course> getCourseBySchoolId(@Param("id") Integer id);


}


