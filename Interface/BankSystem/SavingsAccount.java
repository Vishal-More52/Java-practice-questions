package Interface.BankSystem;

public class SavingsAccount implements Account {
  
  private double balance;
  private double intrestRate;

  // constructor
  public SavingsAccount(double balance,double intrestRate){
    this.balance = balance;
    this.intrestRate = intrestRate;
  }

  @Override
  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public void withdraw(double amount) {
    balance -= amount;
  }

  @Override
  public double getBalance() {
   return balance;
  }

  public void applyIntrest(){
    balance +=balance * intrestRate / 100 ;
  }
}
