package Ques5;

public class Student {

    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    void show(){
        System.out.println("Student Id : "+id);
        System.out.println("Student Name : "+name);
    }
}
