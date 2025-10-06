package Ex_h;

public class Q7 {

    public static void main(String[] args) {
        System.out.println("hello ji"+M1());
    }

    public static int M1(){

        try{
            return 10;
        }

        finally {
            System.out.println("Finally");
        }
    }
}
