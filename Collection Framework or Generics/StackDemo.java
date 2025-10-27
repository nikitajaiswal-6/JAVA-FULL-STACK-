import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
//        List<String> str=new Stack<>();

        Stack<Integer> str=new Stack<>();
        str.push(10);
        str.push(20);
        str.push(30);
        str.push(40);
        str.push(50);
        str.push(60);
        str.push(70);
        str.push(80);
        str.push(90);
        str.push(100);


        System.out.println("Stack are : "+str); // LIFO principle (Last in first out).

        System.out.println("Element pop : "+   str.pop());
        System.out.println("Element pop : "+ str.pop());
        System.out.println("Now the Stack is : "+str);
        System.out.println(str.get(5));



    }
}
