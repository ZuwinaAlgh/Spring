package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SchoolControllerTest {
    @Autowired
    SchoolController schoolController;

    @Test
    void getAllSchools() {

    }

    @Test
    void getSchoolByIdWhenId1() {
        School schoolTest1;
        schoolTest1=schoolController.getSchoolById(1);
        String schoolName=schoolTest1.getSchoolName();
        assertEquals("wee",schoolName);
    }

    @Test
    void getSchoolByName() {
    }

    @Test
    void getAllSchoolsIsActive() {
    }

    @Test
    void getAllSchoolsIsInActive() {
    }

    @Test
    void getLatestRowInSchool() {
    }

    @Test
    void updateIsActive() {
    }

    @Test
    void getSchoolByCreatedDate() {
    }

    @Test
    void getSchoolByUpdatedDate() {
    }

    @Test
    void deleteSchoolById() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void getSchoolCreatedAfterDate() {
    }

    @Test
    void deleteSchoolBySchoolName() {
    }

    @Test
    void deleteSchoolsByCreatedDate() {
    }

    @Test
    void deleteSchoolsByUpdatedDate() {
    }

    @Test
    void createSchool() {
    }

    @Test
    void updateSchool() {
    }

    @Test
    void deleteAllSchoolsCreatedAfterDate() {
    }
}