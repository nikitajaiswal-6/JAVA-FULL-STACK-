package org.question.Q1;

public class StudentsData {

   public Student student;

    public StudentsData(Student student) {
        this.student = student;
        System.out.println("arg constructor  called");
    }

    public StudentsData() {
        System.out.println("default constructor called students data class......");
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudent()
    {

        System.out.println("...............setter methods Called Students Data Class.............");
        student.setId(1);
        student.setName("Nikita mere Jaan");
        student.setCourse("Full Stack Developer");

    }

    public void getStudents()
    {
        System.out.println("--------Get Students With Students Data Class------------");
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getCourse());
        System.out.println("--------------------");
    }

}
