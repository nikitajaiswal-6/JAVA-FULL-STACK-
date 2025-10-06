package Ex_h;

public class TestException2 {

    public static void main(String[] args) {

        System.out.println(" --Before Exception--");

        try {
            System.out.println("Before Risky code");
            System.out.println(10 / 0);  //--Risky code.
            System.out.println("After Risky code");
        }


        catch (ArithmeticException e) { //ArithmeticException----Runtime----Exception -->Dynamic Dispatcher or Runtime Polymorphism.

            System.out.println("In catch block");
            e.printStackTrace();  //- This method print Name of the exception and Description of Exception Stack trace.
            System.out.println(e.toString());  //-Name of the exception : Description of Exception .
            System.out.println(e.getMessage()); //-Returns only Description of trhe exception

        }

        System.out.println("I have something for u ..........");
    }
}
