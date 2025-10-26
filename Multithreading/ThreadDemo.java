
class MyThread extends Thread{

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("Child thread");
        }
    }
}



public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t=new MyThread();
        t.start();

        //t.run();---> if we call run method like this then no new thread is created ,it just call normally the overrided method.
        for (int i=1;i<=5;i++){
            System.out.println("Main thread");
        }
    }


    }

