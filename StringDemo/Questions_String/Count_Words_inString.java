
//6. Count total number of words in a given sentence (without using split).


public class Count_Words_inString {

    public static void main(String[] args) {

        String s="Nikki has worlds best friend SAM☺";

        int cnt=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                cnt++;
            }
        }

        System.out.println("Total num of words is:" +(cnt+1));
    }
}


