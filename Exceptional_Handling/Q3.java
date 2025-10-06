package Ex_h;

public class Q3 {

    public static void main(String[] args) {

        try{
            int[] arr={10,20,30};
            System.out.println(arr[4]);
        }

        finally {
            System.out.println("hello finally");  //ArrayOutOfBoundException is generated because it is not handled .
        }
    }
}

//NOTE-- try ke sath finally bhi lga skte h aur catch bhi liken dono me se koi ek jarur hona chiye kyu ki try always execute in pair.
