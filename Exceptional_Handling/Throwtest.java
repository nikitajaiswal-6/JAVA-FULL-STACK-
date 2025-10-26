

public class Throwtest {

    public static void main(String[] args) {
        try{
            withdraw(1000,2000);
        }

        catch (Exception e){
            System.out.println("error "+e.getMessage());
        }
    }

    public static void withdraw(int bal,int amt) throws Exception {

        if(amt>bal){
//            System.out.println("Insufficient balance");
            throw new Exception ("Insufficient balance"); //deligating

//        ///-- HANDLING
//            try{
//                throw new Exception ("Insufficient balance");
//            }
//
//            catch (Exception e){
//                System.out.println(e);
//            }
        }

        System.out.println("Withdrawal successfully");
    }
}
