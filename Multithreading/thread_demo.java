class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Child class thread");
    }
}


public class thread_demo {

    public static void main(String[] args) { //--- Main thread/ current thread -- which executes main method and its part like t.start
        MyThread t =new MyThread();
        t.start();   //---when we write start ,a new thread is created and is responsible to call run() method.

        for (int i=1;i<=5;i++){
            System.out.println("Main thread");
        }
    }
}
