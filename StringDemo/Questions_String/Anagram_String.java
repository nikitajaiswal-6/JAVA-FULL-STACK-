
//8. Check if two Strings are anagrams of each other.
  //      Example → "listen" and "silent" → true


import java.util.Arrays;

public class Anagram_String {

    public static boolean anagram(String str1,String str2){


        if (str1.length()!= str2.length())
            return false;

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        if (anagram(str1,str2)){
            System.out.println("Strings are anagram");
        }

        else {
            System.out.println("Strings are not anagram");
        }

    }

}

