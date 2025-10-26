
class Interface implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable......");
    }
}


public class InterfaceDemo {

    public static void main(String[] args) {

        Thread t=new Thread(new Interface());
        t.start();


    }
}
