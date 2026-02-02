package Ques12;

public class Universities {

    private int uid;
    private String uname;
    private String uAddress;

    public Universities(int uid, String uname, String uAddress) {
        this.uid = uid;
        this.uname = uname;
        this.uAddress = uAddress;
    }

    void show(){
        System.out.println("University id : "+uid);
        System.out.println("University name : "+uname);
        System.out.println("University Address : "+uAddress);
    }
}
