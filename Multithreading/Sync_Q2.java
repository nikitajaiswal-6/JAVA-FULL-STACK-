class PrintTableThread {

     void printTable(int n)  {

         synchronized (this){  //---Synchronization block ( also recommended).
             for (int i=1;i<=10;i++){
                 System.out.println(Thread.currentThread().getName()+"...."+n*i);
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         }

    }

}

class MyThread4 extends Thread{
    PrintTableThread t;

    public MyThread4(PrintTableThread t){
        this.t=t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

public class Sync_Q2 {
    public static void main(String[] args) {
        PrintTableThread pt=new PrintTableThread();

        MyThread4 m1=new MyThread4(pt);
        MyThread4 m2=new MyThread4(pt);

        m1.start();
        m2.start();

        try{
            System.out.println("Main thread is waiting");
            m1.join();
            m2.join();
            System.out.println("Main thread completed its execution");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
