
 class Hellothread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("Hello");
        }
    }
}

class WorldThread extends Thread{
     Hellothread t1;

    WorldThread(Hellothread t1){
        this.t1=t1;
    }

    @Override
    public void run() {
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0;i<5;i++){
            System.out.println("World");
        }
    }
}

public class TestThread{
    public static void main(String[] args) {
          Hellothread h1=new Hellothread();
          WorldThread w1=new WorldThread(h1);

          h1.start();
          w1.start();
    }
}
