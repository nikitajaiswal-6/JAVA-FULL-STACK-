
//1. Reverse String without using StringBuilder or StringBuffer.
     //   (Hint: Use loop or char array manually.)


import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();

        String rev="";

        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }

        System.out.println("Reversed String:"+rev);
    }
}
