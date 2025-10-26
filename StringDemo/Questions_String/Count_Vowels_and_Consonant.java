
//3. Count vowels and consonants in a given String.


import java.util.Scanner;

public class Count_Vowels_and_Consonant {
    public static void main(String[] args) {

        int vowel = 0, consonant = 0;

        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                vowel++;
            } else {
                consonant++;
            }
        }

            System.out.println("No. of vowels:" + vowel);
            System.out.println("No. of consonants:" + consonant);
        }
    }
