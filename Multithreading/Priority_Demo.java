

class MyThread3 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}


public class Priority_Demo {
    public static void main(String[] args) {
        MyThread3 t1=new MyThread3();
        t1.start();
        t1.setName("Thread-t1");
        t1.setPriority(Thread.MIN_PRIORITY);

        MyThread3 t2=new MyThread3();
        t2.start();
        t2.setName("Thread-t2");
        t2.setPriority(Thread.MAX_PRIORITY);

        MyThread3 t3=new MyThread3();
        t3.start();
        t3.setName("Thread-t3");
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }
}
