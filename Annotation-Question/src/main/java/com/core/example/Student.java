package com.core.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    Course course;

    @Autowired
    public Student(Course course) {
        this.course = course;
    }

    void disp(){
        course.show();
    }

}
