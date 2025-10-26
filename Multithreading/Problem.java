
//Note--synchronization is used when we want to execute a thread at a time or you can say for thread safety.
// .It does not support multithreading.

class  Addition{
public int sum=0;

synchronized void Sum(){ //here u can see one object is shared between two threads and are executing concurrently due
                         //to which sum func() gives wrong output.
    sum=sum+1;
}
}

class Thread1 extends Thread{
    Addition add;

    public Thread1(Addition add){
        this.add=add;
    }

    @Override
    public void run() {
        for (int i=1;i<=1000;i++){
            add.Sum();
        }
    }
}

class Thread2 extends Thread{
    Addition add;

    public Thread2(Addition add){
        this.add=add;
    }

    @Override
    public void run() {
        for (int i=1;i<=1000;i++){
            add.Sum();
        }
    }
}

public class Problem {
    public static void main(String[] args) throws InterruptedException {
        Addition a=new Addition();

        Thread1 t1=new Thread1(a);
        Thread2 t2=new Thread2(a);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("sum="+a.sum);

    }
}
