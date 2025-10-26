
//10. Find the longest word in a given sentence.


public class Longest_Word_instring {
    public static void main(String[] args) {
        String str="Java is object oriented programming Language";

        String[] words=str.split(" ");

        String longest_Word="";
        int max_len=Integer.MIN_VALUE;

        for (String word:words){
            if (word.length()>max_len){
                max_len=word.length();
                longest_Word=word;
            }
        }

        System.out.println("Longest word:"+longest_Word);
    }


}
