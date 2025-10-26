
class Set_p extends Thread{

    @Override
    public void run() {
        System.out.println("Child class priority:"+Thread.currentThread().getPriority());
        System.out.println("Child Thread name:"+Thread.currentThread().getName());
    }
}


public class SetPriority {

    public static void main(String[] args) {
        Set_p s1=new Set_p();
        s1.setName("Thread-s1");
        s1.setPriority(Thread.MIN_PRIORITY);

        Set_p s2=new Set_p();
        s2.setName("Thread-s2");
        s2.setPriority(Thread.MAX_PRIORITY);

        s1.start();
        s2.start();

        Set_p s3 =new Set_p();
        s3.start();

    }
}
