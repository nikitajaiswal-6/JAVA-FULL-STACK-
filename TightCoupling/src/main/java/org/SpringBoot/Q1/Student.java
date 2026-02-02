package org.SpringBoot.Q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    Course course;

    String stName="Nikita";
    String fee= "6999";

    public Student() {
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public void showCourse()
    {
        System.out.println("| Student-Name: "+stName+" |Course: "+course.courseName+" |Payments: "+fee+" |");
    }
}
