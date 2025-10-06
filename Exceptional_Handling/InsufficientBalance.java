package Ex_h;

public class InsufficientBalance extends Exception{ // or u can extend  RuntimeException class also

  public InsufficientBalance(String message) {
    super(message); //calling parent class constructor
  }
}
