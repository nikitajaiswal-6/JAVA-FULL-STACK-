
//2. Check if a given String is a palindrome (same forward and backward).
//        Example → "NIKKIN" → true, "SAM" → false


import java.util.Scanner;

public class is_Pallindrome_String {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        String rev="";

        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.print("Reversed String: ");
        boolean is_palindrome=true;
        for (int i=0;i<str.length()/2;i++){
            if (rev.charAt(i)!= str.charAt(i)){
                is_palindrome=false;
            }
        }
        System.out.println(rev);

        if (is_palindrome){
            System.out.println("String is palindromic");
        }
        else {
            System.out.println("String is not palindromic");
        }

    }
}
