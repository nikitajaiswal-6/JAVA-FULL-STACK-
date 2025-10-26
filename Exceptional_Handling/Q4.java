

public class Q4 {

    public static void main(String[] args) {

        try{
            int[] arr={10,20,30};
            System.out.println(arr[4]);
        }

        catch(ArithmeticException e){
            System.out.println("'ArithmeticException");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        catch (Exception e){
            System.out.println("Exception ");
        }

        finally {
            System.out.println("hello finally");
        }
    }
}
