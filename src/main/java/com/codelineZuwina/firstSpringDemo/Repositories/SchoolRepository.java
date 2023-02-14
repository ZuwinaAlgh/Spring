package com.codelineZuwina.firstSpringDemo.Repositories;

import com.codelineZuwina.firstSpringDemo.Models.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School,Integer> {
    @Query(value="SELECT s from School s")
    List<School> getAllSchools();
    @Query(value="SELECT s from School s Where s.id = :id")
    School getSchoolById(@Param("id") Integer id);


    @Query(value="SELECT s from School s Where s.schoolName= :School_name")
    School getSchoolByName(@Param("School_name") String School_name);

    @Query(value="SELECT s from School s Where s.isActive=True")   //query to get all school is active
    List<School> getAllSchoolsIsActive();

    @Query(value="SELECT s from School s Where s.isActive=False")   //query to get all school is InActive
    List<School> getAllSchoolsIsInActive();

    @Query(value ="SELECT s From School s Where s.id=(SELECT MAX(s.id) From School s)")  //Query to get Latest Row
    List<School> getLatestRow();


}
