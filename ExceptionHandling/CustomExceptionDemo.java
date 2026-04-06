package ExceptionHandling;

// Custom Checked Exception
class InsufficientBalanceException extends Exception {

  private double amount;

  public InsufficientBalanceException(double amount) {
    super("Insufficient Balance . sort by : " + amount);
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

}

class InvalidAgeException extends RuntimeException {
  public InvalidAgeException(String message) {
    super(message);
  }
}

public class CustomExceptionDemo {

  public void WithDrawal(double balence , double amount) throws InsufficientBalanceException{
     if(balence < amount){
      throw new InsufficientBalanceException(amount - balence);
     }
  }
  public static void main(String[] args) {
    CustomExceptionDemo obj = new CustomExceptionDemo();

    try {
      obj.WithDrawal(500, 800);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
      System.out.println("Short amount . " + e.getAmount());
    }
  }
}
