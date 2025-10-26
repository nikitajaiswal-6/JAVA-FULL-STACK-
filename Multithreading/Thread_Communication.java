
class Thread_A extends Thread{
    int total=0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child thread start calling....");
            for (int i=1;i<=100;i++){
                total=total+i;
            }
            this.notify();
            System.out.println("Child Thread giving notification");
        }
    }
}


public class Thread_Communication {
    public static void main(String[] args) throws InterruptedException {
        Thread_A t1=new Thread_A();
        t1.start();

        synchronized (t1){
            System.out.println("Main thread waiting");
            t1.wait();
            System.out.println("Main thread notified");
            System.out.println("Total= "+t1.total);
        }
    }
}
