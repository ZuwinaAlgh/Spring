package com.codelineZuwina.firstSpringDemo.BusinessObject;

import javax.persistence.Column;

public class SchoolBO {
    @Column(name="School_name")
    String schoolName;
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
