package com.codelineZuwina.firstSpringDemo.Repositories;

import com.codelineZuwina.firstSpringDemo.Models.School;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School,Integer> {
    @Query(value="SELECT s from School s")                //get all
    List<School> getAllSchools();
    @Query(value="SELECT s from School s Where s.id = :id")           //get by School id
    School getSchoolById(@Param("id") Integer id);

    @Query(value="SELECT s from School s Where s.schoolName= :School_name")        //get by school name
    School getSchoolByName(@Param("School_name") String School_name);

    @Query(value="SELECT s from School s Where s.isActive=True")   //query to get all school is active
    List<School> getAllSchoolsIsActive();

    @Query(value="SELECT s from School s Where s.isActive=False")   //query to get all school is InActive
    List<School> getAllSchoolsIsInActive();

    @Query(value ="SELECT s From School s Where s.id=(SELECT MAX(s.id) From School s)")  //Query to get Latest Row
    List<School> getLatestRow();

    @Query(value = "UPDATE School s SET s.isActive=True Where s.isActive=False and s.id= :id")     //Update is Active
    School updateIsActive(@Param("id") Integer id);

    @Query(value ="SELECT s from School s where s.createdDate= :createdDate")         //get School By CreatedDate
    School getSchoolByCreatedDate(@Param("createdDate") Date createdDate);

    @Query(value ="SELECT s from School s where s.updatedDate= :updatedDate")         //get School By updated Date
    School getSchoolByUpdatedDate(@Param("updatedDate") Date updatedDate);


   @Modifying
   @Transactional
   @Query(value="UPDATE School s SET s.isActive=False")                               //Delete All(Update)
    void deleteAllSchool();

   @Query(value="SELECT s From School s Where s.createdDate>= :createdDate")                //get School Created After Date
   List<School>  getSchoolCreatedAfterDate(@Param("createdDate") Date createdDate);

    @Query(value = "SELECT s from School s where s.createdDate> :createdDate")              //deleteAllSchoolsCreatedAfterDate
    List<School> deleteAllSchoolsCreatedAfterDate(@Param("createdDate") Date createdDate);



}
