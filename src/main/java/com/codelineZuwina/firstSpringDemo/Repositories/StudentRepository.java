package com.codelineZuwina.firstSpringDemo.Repositories;

import com.codelineZuwina.firstSpringDemo.Models.School;
import com.codelineZuwina.firstSpringDemo.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    @Query(value="SELECT s from Student s")                    //get All
    List<Student> getAllStudent();

    @Query(value="SELECT s from Student s Where s.id = :id")                      // get Student by id
    Student getStudentById(@Param("id") Integer id);

    @Query(value="SELECT s from Student s Where s.studentName = :studentName")          //get By Student Name
    Student getStudentByStudentName(@Param("studentName") String student_Name);

    @Query(value="SELECT st from Student st Where st.school.id= :id")                  // get Students By SchoolId
    List<Student> getStudentBySchoolId(@Param("id") Integer id);

    @Query(value="SELECT s from Student s Where s.isActive=True")                     //query to get all Student is active
    List<Student> getAllStudentsIsActive();

    @Query(value="SELECT s from Student s Where s.isActive=False")                     //query to get all Student is InActive
    List<Student> getAllStudentsIsInActive();




}

