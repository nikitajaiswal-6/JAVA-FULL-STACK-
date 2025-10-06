package Ex_h;


public class CatchDemo {

    public static void main(String[] args) {

        System.out.println(" Before Try block ");

        try{
            //Code thet may throw an exception.
            int res=10/0;
            System.out.println(res);
        }

        catch(ArithmeticException e){
            //Handle specific Exception.
            System.out.println("Arithmetic Exception:"+e.getMessage());
        }

        /// NOTE:if there is no specific handle exception or if u don't no which exception is going to occur then the exception is handled by
        ///      the parent class of that exception like for above exception i.e ArithmeticException if it is not there then it is handled by
        ///      Exception class object.

        catch (Exception ex){
            System.out.println(" Parent class  object Handling exception ");
        }

//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }

        finally {
            //Cleanup code or resources release.
            System.out.println("  Finally Always Executed ");
        }
    }
}
