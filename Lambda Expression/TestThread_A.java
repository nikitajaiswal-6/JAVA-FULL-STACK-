public class TestThread_A {

    public static void main(String[] args) throws InterruptedException {
//     Thread_A task=new Thread_A();
//     task.start();
     ///task.join();

//        Runnable Task=()-> System.out.println("Hello Task........."); //-Single line task ke liye koi
                                                                       //curly braces nhi lgaye ge
//        new Thread(Task).start();

        Runnable Task=()-> {
            for (int i=0;i<5;i++){
                System.out.println("Child Thread");
            }
        };

       new Thread(Task).start();

        for (int i=0;i<5;i++){
         System.out.println("Main");
     }

    }
}
