
//7. Find the first non-repeated character in a String.
      //  Example → "aabbcddee" → ‘c’


import java.util.LinkedHashMap;
import java.util.Map;

public class First_non_Duplicate_Char {
    public static void main(String[] args) {
        String str="aabbcddee";
        System.out.println("First non duplicate character : "+firstnonduplicate(str));
    }

    public static char firstnonduplicate(String str){
        Map<Character,Integer> countMap=new LinkedHashMap<>(); //preserve order.

        for (char c:str.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1); //count occurrences and update the count by one.
                                              // Yha pe c jo h key h jeske value phle c='a',c='a',c='b',c='b' and so on......
        }

        for (Map.Entry<Character,Integer> entry:countMap.entrySet()){ // yha pe humne entry variable ka type Map.Entry<Character,Integer
                                                                      //kyu rakha h kyu ki countmap me pura key value pair h aur map.entry me
                                                                     //ek ek key value h to humko kyu ki iterate krna h to ek ek karke hi karege.
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '_';
    }

}
