import java.util.Scanner;

class BankAccount{
    private double balance=0;

    synchronized void deposit(double amount){
        balance+=amount;
        System.out.println("Depositor deposited ₹"+amount+"| Balance ="+balance);
        notify();
    }

    synchronized void withdraw(double amount) throws InterruptedException {

        while(balance<amount){
            System.out.println("Withdrawer wait..."+"Required amount: ₹"+amount+"Available balance:₹"+balance);
            wait();
        }

        balance -=amount;
        System.out.println("Withdrawer withdrawed:₹ "+amount+"Remaining balance:₹"+balance);

    }
}

class Depositor extends Thread{

    BankAccount bankAccount;
    double bal;

    Depositor (BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    void Deposit(){
        System.out.println("Enter the Deposit amount:");
        Scanner scanner=new Scanner(System.in);
        bal= scanner.nextDouble();
    }

    @Override
    public void run() {
          for (int i=0;i<5;i++){
              bankAccount.deposit(10000);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
    }
}

class Withdrawer extends Thread{

    BankAccount bA;

    Withdrawer (BankAccount bA){
        this.bA=bA;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                bA.withdraw(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class BankTransaction_System {
    public static void main(String[] args) throws InterruptedException {

        BankAccount B_Account=new BankAccount();

        Depositor D1=new Depositor(B_Account);
        Withdrawer W1=new Withdrawer(B_Account);

        D1.start();
        W1.start();

//        D1.join();
//        W1.join();
//

    }
}
