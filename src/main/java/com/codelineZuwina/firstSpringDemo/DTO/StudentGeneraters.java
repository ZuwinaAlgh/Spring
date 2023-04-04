package com.codelineZuwina.firstSpringDemo.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class StudentGeneraters {
    Integer id;
    String studentName;
    String schoolName;

    public StudentGeneraters(Integer id, String student_name, String school_name) {
        this.id = id;
        this.studentName = student_name;
        this.schoolName = school_name;
    }
}
