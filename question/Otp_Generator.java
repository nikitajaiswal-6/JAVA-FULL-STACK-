import java.util.Random;

public class Otp_Generator {
    public static void main(String[] args) {

        Random random=new Random();
        String s="abcdefghijklmnopqrstuvwxyzABCDEFZHIJKLMNOPQRSTUVWXYZ0123456789@#£&";
        int length=6;
        String password="";


        for(int i=1;i<=length;i++){
            int index= random.nextInt(s.length());
            password=password+s.charAt(index);
        }
        System.out.println("Generated OTP="+password);

    }


}


