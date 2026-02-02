import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> str=new HashSet<>();

        //No duplicates .
        //No random access.
        //insertion order not  preserved.

        str.add("Radhe");
        str.add("krishna");
        str.add("Nikita");
        str.add("Sameer");
        str.add("Sameer");

        System.out.println(str);
    }
}
