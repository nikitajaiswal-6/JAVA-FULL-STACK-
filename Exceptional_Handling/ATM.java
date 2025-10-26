

public class ATM {

    public static void main(String[] args) {
        try{
            withdraw(1000,2000);
        }

        catch (InsufficientBalance e){
            System.out.println("Exception bal insufficient");
            System.out.println(e);
        }

        catch (Exception e){
            System.out.println("Error occured");
            System.out.println(e);
        }
    }

    public static void withdraw(double bal,double amt) throws InsufficientBalance {

        if (amt>bal){
            throw new InsufficientBalance("Insufficient balance :"+ "Available bal:"+ bal+" Requested:"+amt);
        }

        System.out.println("Withdrawal successfully of amount:"+amt);

    }

}


