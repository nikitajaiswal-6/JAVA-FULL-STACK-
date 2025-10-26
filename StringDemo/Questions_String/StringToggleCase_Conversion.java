
//9. Toggle each character’s case in a String.
    //    Example → "Java123" → "jAVA123"


public class StringToggleCase_Conversion {
    public static void main(String[] args) {

        String str="JAvA PrOgrAmMiNg";

        StringBuilder toggleStr=new StringBuilder();

        for (char ch:str.toCharArray()){
            if (Character.isUpperCase(ch)){
                toggleStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggleStr.append(Character.toUpperCase(ch));

            }
            else {
                toggleStr.append(ch);
            }
        }
        System.out.println("Toggled str:"+toggleStr.toString());
    }

}
