
public class Q1  extends Thread{
    @Override
    public void run() {
        System.out.println("Running:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Q1 Q=new Q1();
        Q.start();  //new thread bnega.
        Q.run();    //same main thread me chalega .
    }
}
