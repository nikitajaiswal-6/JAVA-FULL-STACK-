
//4. Find frequency of each character in a String.
//Example → "Java" → J=1, a=2, v=1


import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_ofEachCharacter {
    public static void main(String[] args) {
        String str="programming";

        Map<Character,Integer> countMap=new LinkedHashMap<>();

        for (char ch:str.toCharArray()){
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
        }

        for ( Map.Entry<Character,Integer> entry:countMap.entrySet()){
            System.out.println(entry.getKey()+"<---->"+entry.getValue());
        }
    }

}
