
class SleepDemo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(getName()+"....."+i);
            try {
                Thread.sleep(1000); //sleep--Sleep method pause the current thread for specific no. of millisecond.
                                         //sleep() method also through a checked exception(Interrupt Exception).
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}


public class Sleep_Demo {
    public static void main(String[] args) {
        SleepDemo sd=new SleepDemo();
        sd.setName("Child thread");
        sd.start();

    }
}
