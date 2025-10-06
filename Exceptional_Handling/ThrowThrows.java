package Ex_h;

public class ThrowThrows {

    public static void main(String[] args) {

        try{
            checkAge(-1);
        }

        catch (Exception e){
            System.out.println("Invalid check:"+e.getMessage());
        }
    }

    public static void checkAge(int  age) throws Exception {

        if(age<0){
            throw new Exception("age cannot be negative");
        }

        if(age<18){
            throw new Exception("You are underage");
        }
    }
}
