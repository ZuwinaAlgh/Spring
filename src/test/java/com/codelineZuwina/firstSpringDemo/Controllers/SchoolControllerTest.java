package com.codelineZuwina.firstSpringDemo.Controllers;

import com.codelineZuwina.firstSpringDemo.Models.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

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
    void getSchoolByIdWhenId2() {
        School schoolTest2;
        schoolTest2=schoolController.getSchoolById(2);
        String schoolName=schoolTest2.getSchoolName();
        assertEquals("Seeb International",schoolName);
    }

    @Test
    void getSchoolByIdWhenId3() {
        School schoolTest3;
        schoolTest3=schoolController.getSchoolById(3);
        String schoolName=schoolTest3.getSchoolName();
        assertEquals("Alandlus",schoolName);
    }

    @Test
    void getSchoolByIdWhenId4() {
        School schoolTest4;
        schoolTest4=schoolController.getSchoolById(4);
        String schoolName=schoolTest4.getSchoolName();
        assertEquals("ABQ",schoolName);
    }

    @Test
    void getSchoolByName1() {
        School schoolNameTest1;
        schoolNameTest1=schoolController.getSchoolByName("wee");
        int id=schoolNameTest1.getId();
        assertEquals(1,id);
    }

    @Test
    void getSchoolByName2() {
        School schoolNameTest2;
        schoolNameTest2=schoolController.getSchoolByName("Seeb International");
        int id=schoolNameTest2.getId();
        assertEquals(2,id);
    }

    @Test
    void getSchoolByName3() {
        School schoolNameTest3;
        schoolNameTest3=schoolController.getSchoolByName("Alandlus");
        int id=schoolNameTest3.getId();
        assertEquals(3,id);
    }

//    @Test
//    void getSchoolByName4() {
//        School schoolNameTest4;
//        schoolNameTest4=schoolController.getSchoolByName("ABQ");
//        int id=schoolNameTest4.getId();
//        assertEquals(4,id);
//    }

//    @Test
//    void getAllSchoolsIsActive() throws Exception {
//        List<School> schoolIsActiveTest=schoolController.getAllSchoolsIsActive();
//        assertNotNull(schoolIsActiveTest);
//    }

//    @Test
//    void getAllSchoolsIsInActive() {
//        List<School> schoolListTestInActive=schoolController.getAllSchoolsIsInActive();
//        assertNotNull(schoolListTestInActive);
//    }

//    @Test
//    void getLatestRowInSchool1() throws Exception {
//     List<School> schoolTestLatestRow=schoolController.getLatestRowInSchool();
//     assertNotNull(schoolTestLatestRow);
//
//    }

//    @Test
//    void updateIsActive() {
//        School schoolIsActiveTest1;
//        schoolIsActiveTest1=schoolController.getSchoolById(1);
//        String schoolName=schoolIsActiveTest1.getSchoolName();
//        assertEquals("wee",schoolName);
//    }

//    @Test
//    void updateIsActive2() {
//        School schoolIsActiveTest2;
//        schoolIsActiveTest2=schoolController.getSchoolByName("ABQ");
//        boolean isActive=schoolIsActiveTest2.getActive();
//        assertEquals(true,isActive);
//    }
//
//    @Test
//    void updateIsActive3() {
//        School schoolIsActiveTest3;
//        schoolIsActiveTest3=schoolController.getSchoolById(3);
//        boolean isActive=schoolIsActiveTest3.getActive();
//        assertNotEquals(true,isActive);
//    }


//    @Test
//    void getSchoolByCreatedDate() {
//    School schoolByCreatedDate;
//    schoolByCreatedDate=schoolController.getSchoolByCreatedDate(2023-03-06);
//    int id=schoolByCreatedDate.getId();
//    assertEquals(1,id);
//    }

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