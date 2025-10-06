package Ex_h;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsTest {

    public static void main(String[] args) {//throws FileNotFoundException

        try{
            m1();
        }
        catch (Exception e){
            System.out.println("Done");
        }
    }

    public static void m1() throws FileNotFoundException{

        m2("test1.txt");
        System.out.println("hello m1");

    }

    public static void m2(String filename) throws FileNotFoundException {

        try{
            FileReader  fr  =new FileReader(filename);
        }

        finally {
            System.out.println("Finally.....");
        }
    }
}
