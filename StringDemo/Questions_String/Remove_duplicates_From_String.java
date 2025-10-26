
//5. Remove all duplicate characters from a String.
//        Example → "programming" → "progamin"


public class Remove_duplicates_From_String {
    public static void main(String[] args) {

        String s="programming";
        char[] unique=new char[s.length()];
        char[] org_Arr=s.toCharArray();

        System.out.print("Original String:"+s);
        System.out.println();
        int index=0;

        for (int i=0;i<s.length();i++){
            boolean is_duplicate=false;
            for (int j=0;j<index;j++){
                if (org_Arr[i]==unique[j]){
                    is_duplicate=true;
                    break;
                }
            }

            if (!is_duplicate){
                unique[index]=org_Arr[i];
                index++;
            }
        }

        System.out.print("String after removing duplicates:");
        for (int i=0;i<index;i++){
            System.out.print(unique[i]);
        }

    }
}
