package Ques1;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentImp {


    student std;

    public StudentImp(student std) {
        System.out.println("student bean instantiated...");
        this.std = std;
    }


    void details(){
        System.out.println("Id : "+std.getId());
        System.out.println("Name : "+std.getName());
        System.out.println("Course : "+std.getCourse());
    }
}
