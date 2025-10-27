import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //List<Integer> v1=new Vector<>();

        //insertion order preserve
        //Duplicate.
        //Random access.
       //  thread safe( Synchronised method).

        //All the common methods that we use in Arraylist are available in vector also.

        Vector<Integer> v1=new Vector<>();

        v1.add(100);
        v1.add(200);
        v1.add(300);
        v1.add(400);
        v1.add(500);
        v1.add(600);
        v1.add(700);
        v1.add(800);
        v1.add(900);
        v1.add(1000);
        v1.add(100);
        v1.add(200);
        v1.add(100);
        v1.add(200);

        System.out.println("Vector List:"+v1);
        System.out.println(v1.get(5));


    }
}
