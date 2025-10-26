

public class Q5 {

    public static void main(String[] args) {

        try{

            try{
                int x=100/0;
            }

            catch(NullPointerException e){
                System.out.println("Inner-catch");
            }

            catch (ArithmeticException e){
                System.out.println("Inner-catch-Arithmetic"); // executed printed
            }
        }

        catch (Exception e){
            System.out.println("outer-catch"); // if there is no inner ArithmeticException handled catch then the outer catch will executed.
        }

        finally {
            System.out.println("done"); //printed
        }
    }
}
