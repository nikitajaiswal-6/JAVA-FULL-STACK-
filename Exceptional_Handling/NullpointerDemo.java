package Ex_h;

public class NullpointerDemo {

    public static void main(String[] args) {

        String s=null;

        try {
            int length = s.length();
        }

        catch (ArithmeticException e){
            System.out.println(e);   //If we are going to handle our risky code with this exception then it is called Exception mismatch .
                                     //So it is necessary to handle our risky code either with the specific Exception or with parent Exception.
        }

        catch (NullPointerException e){
            System.out.println(e);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }

        catch (StackOverflowError e){
            System.out.println(e.getMessage());
        }

    }
}
