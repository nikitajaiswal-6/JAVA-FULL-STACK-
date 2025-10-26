
class YieldDemo extends Thread{

    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"....."+i);
            Thread.yield();  //Yield()--I am willing to pause and give a chance to a thread of equal priority.
                            //it's not guaranteed - it is just a signal or command.
        }
    }
}


public class Yield_Demo {
    public static void main(String[] args) {
        YieldDemo yd1=new YieldDemo();
        yd1.start();

        YieldDemo yd2=new YieldDemo();
        yd2.start();

    }
}
