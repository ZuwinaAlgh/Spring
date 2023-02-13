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


@Query(value="SELECT s from School s Where s.schoolName= :schoolName")
    School getSchoolByName(@Param("schoolName") String schoolName);

}
