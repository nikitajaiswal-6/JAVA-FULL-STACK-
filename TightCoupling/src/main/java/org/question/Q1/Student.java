package org.question.Q1;

/*Q1.
Spring XML file ka use karke ek Student bean create karo jisme:
id
name
course
properties ho.
Aur ApplicationContext se object access karo.
*/
public class Student
{

  public   int id;
   public String name;
   public String course;

    public Student() {
        System.out.println("default constructor called Students Class...");
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        System.out.println("arg Constructor called.........");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
