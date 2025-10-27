import java.util.ArrayList;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();

        for (int i=1;i<=5;i++){
            num.add(i);
        }
        System.out.println("List is:"+num);

        if (num.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.println("List is not empty");
        }

        num.clear();
        System.out.println("List is :"+num);

        if (num.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.println("List is not empty");
        }
    }
}
