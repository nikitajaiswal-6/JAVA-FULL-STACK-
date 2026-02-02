package Ques12;

public class Students {

    private int sid;
    private String sname;
    private String scourse;

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setScourse(String scourse) {
        this.scourse = scourse;
    }

    void disp(){
        System.out.println("Student id : "+sid);
        System.out.println("Student name : "+sname);
        System.out.println("Student course : "+scourse);

    }
}
