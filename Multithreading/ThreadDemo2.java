
 class MyThread2 extends Thread{

     @Override
     public void run() {

     }
 }


public class ThreadDemo2 {

    public static void main(String[] args) {

        MyThread2 mt=new MyThread2();
        mt.start(); //--- new thread is created but has no body.

        System.out.println("main thread");
    }
}
