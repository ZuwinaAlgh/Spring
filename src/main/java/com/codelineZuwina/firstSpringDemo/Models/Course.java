package com.codelineZuwina.firstSpringDemo.Models;

import javax.persistence.*;
import java.util.List;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name="course_name")
    String name;

    @ManyToOne
    @JoinColumn(name="student_id",referencedColumnName = "id")
    Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
