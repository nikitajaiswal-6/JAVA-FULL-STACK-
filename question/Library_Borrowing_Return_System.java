import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

class Library_System{
   ArrayList<String> Books=  new ArrayList<>();
   int AvailableBooks=3;

   public Library_System(){
       Books.add("C++");
       Books.add("Java");
       Books.add("MySQL");
   }

   synchronized void BorrowBooks() throws InterruptedException {
       while(Books.isEmpty()){
           System.out.println("Currently no books are available.....You have to wait ");
           wait();
           }

          String borrowedBooks= Books.remove(0);
           System.out.println("Books Borrowed:"+ borrowedBooks);
           notifyAll();
       }


   synchronized void ReturnBooks(String book) throws InterruptedException {
       while(Books.size()==AvailableBooks){
           System.out.println("Library Stock is full....Wait for space");
           wait();
       }
       Books.add(book);
       System.out.println("Student Returned......."+book);
       System.out.println("student returned....☺ Why u are returning the books any problem do have in the books i don;t know why all the ");
       notifyAll();
   }
}

class BorrowBook_A extends Thread{
    Library_System ls1;

    BorrowBook_A(Library_System ls){
        this.ls1=ls;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                ls1.BorrowBooks();
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ReturnBooks_A extends Thread{
    Library_System ls2;

    ReturnBooks_A(Library_System ls2){
        this.ls2=ls2;
    }

    @Override
    public void run() {
        String str[]={"HTML","CSS","Javascript","Kotlin","kafka"};
           for (String s:str){
               try {
                ls2.ReturnBooks(s);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}




public class Library_Borrowing_Return_System {

    public static void main(String[] args) throws InterruptedException {
        Library_System librarySystem=new Library_System();
        BorrowBook_A BA=new BorrowBook_A(librarySystem);
        ReturnBooks_A RA=new ReturnBooks_A(librarySystem);

        BA.start();
        RA.start();

        BA.join();
        RA.join();

        System.out.println(librarySystem.Books);
    }
}
