package Interface.BankSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  // Use <Account> to tell Java what this list holds
  private List<Account> accounts; 

  public Bank(){
    accounts = new ArrayList<>();
  }

  public void addAccount(Account account){
    // Corrected: Use the list 'accounts', not the parameter 'account'
    accounts.add(account);
  }
 
  public void removeAccount(Account account){
    accounts.remove(account);
  }

  public void deposit(Account account, double amount){
    account.deposit(amount);
  }

  public void withdraw(Account account, double amount){
    account.withdraw(amount);
  }

  public void printAccountBalance(){
    // This loop will now work because 'accounts' is properly typed
    for(Account account : accounts){
      System.out.println("Account balance: " + account.getBalance());
    }
  }
}