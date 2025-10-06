package Ex_h;

public class Qo1 {

    public static void main(String[] args) {

        System.out.println("Hello");

        try{
            System.out.println("I am");
        }

        catch (Exception e){
            System.out.println("Exception");  // Catch skipped becz No error found so  no object is created by jvm and finally no object is needed
                                             //to hold it.
        }

        System.out.println("Done");
    }
}
