

class JoinDemo extends Thread{

    @Override
    public void run() {

        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);//--if we sleep child method for sometimes instead of that the main will wait.
            }
            System.out.println("Child Thread");
        }
    }
}



public class Join_Demo {
    public static void main(String[] args) throws InterruptedException {

        JoinDemo jd=new JoinDemo();
        jd.start();
        jd.join();// The method which execute this line (main) will wait i.e child class will execute first then main class.

        for (int i=1;i<=5;i++){
            System.out.println("Main Thread");
        }

    }
}
