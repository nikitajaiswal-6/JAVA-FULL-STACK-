import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Insertion Order preserve (mtlb jis sequence me store kraya gya h  use sequence me output ayega .
        //Random Access.
        //Duplicate.
        //Not thread safe(No Synchronised method).

      List<Integer> a1= new ArrayList<>(); //parent holding child object.

        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(60);
        a1.add(70);
        a1.add(80);
        a1.add(90);
        a1.add(100);
        a1.add(100); //Duplicates Allowed.
        a1.add(5,20);

        System.out.println(a1);
        System.out.println(a1.get(5)); //Random Access
        System.out.println(a1.size()); //11
        System.out.println(a1.remove(10));
        System.out.println(a1);//100
        a1.clear();
        System.out.println(a1);

        if(a1.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("List has elements"+a1);
        }

    }
}
