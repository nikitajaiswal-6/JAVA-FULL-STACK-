package Ex_h;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedDemo {

    public static void main(String[] args)  throws IOException {

        FileInputStream fis=null;

        try{
         fis=new FileInputStream("test.txt");
        }

        catch (IOException e){
            System.out.println("Error reading file");
            System.exit(0);  // To stop finally.
        }

        finally {
//            fis.close();  //Why close is suggesting to handle the error at compile time because  it  is a checked Exception.
                            //this will through nullPointerException because initially when file is not added then the file will not found
                           //so it will move to the catch and finally close() will through the Exception.

            fis.close();
            System.out.println("Finally");
        }


    }

}
