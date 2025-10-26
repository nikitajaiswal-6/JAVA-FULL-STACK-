

class ChildThread extends Thread{

    @Override
    public void run() {
        System.out.println("default thread name of child class:");
        System.out.println(Thread.currentThread().getName());

        System.out.println("(USer defined name)");

    }

}


public class SetThreadName {
    public static void main(String[] args) {

        System.out.println("Original thread name:");
        System.out.println(Thread.currentThread().getName());

        Thread t=Thread.currentThread();
        t.setName("Setting the name main thread again");
        System.out.println("----------------------");
        System.out.println("New name:");
        System.out.println(Thread.currentThread().getName());

        System.out.println("--------------------");
        ChildThread c=new ChildThread();
        c.start();

        c.setName("child thread");

    }
}
