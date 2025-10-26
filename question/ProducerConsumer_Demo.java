import java.util.ArrayList;

class Warehouse{
    ArrayList<Integer> buffer=new ArrayList<>();
    int MAX_item=3;

    synchronized void consume() throws InterruptedException {
        while(buffer.isEmpty()){
            System.out.println("buffer is empty.... Consumer will wait ☺");
            for (int i=0;i<5;i++){
                System.out.print(".");
                Thread.sleep(50);
            }
            System.out.println();
            wait();
        }

        int value=buffer.remove(0);
        System.out.println("Consumer consume:"+value);
        Thread.sleep(1000);
        notify();
    }

    synchronized void produce(int item) throws InterruptedException {

        while (buffer.size()==MAX_item){
            System.out.println("buffer is full wait..... Producer will wait ☺");
           for (int i=0;i<5;i++){
               System.out.print(".");
               Thread.sleep(50);
           }
            System.out.println();
           wait();
        }

        buffer.add(item);
        System.out.println("Producer produced:"+item);

        Thread.sleep(1000);
        notify();
    }
}

class Producers extends Thread{
    Warehouse wh;

    Producers (Warehouse wh){
        this.wh=wh;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                wh.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumers extends Thread{
    Warehouse wh;

    Consumers  (Warehouse wh){
        this.wh=wh;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                wh.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ProducerConsumer_Demo {
    public static void main(String[] args) {

        Warehouse w1=new Warehouse();
        new Producers(w1).start();
      new Consumers(w1).start();



    }
}
