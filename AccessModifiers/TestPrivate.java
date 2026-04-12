package AccessModifiers;

class BankAccount{

  //private valriable: cannot be seen or change directly from outside 
  private double balance = 1000.0;

  //public method to provide controlled access to the private variable
  public void deposit(double amount){
    if(amount > 0){
      balance += amount;
      System.out.println("Deposited: " + amount);
    }
  }
  public double getBalance(){
    return balance;
  }
}
public class TestPrivate {
public static void main(String[] args)   {
    BankAccount account = new BankAccount();

    // System.out.println(account.balance()); // This will cause a compile-time error because balance is private

    account.deposit(500);
    System.out.println("Current Balance: " + account.getBalance());
}
  
}
