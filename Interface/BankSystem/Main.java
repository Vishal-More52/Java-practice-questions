package Interface.BankSystem;

public class Main {
  public static void main(String[] args) {
    
    //create instance object of bank class
    Bank bank = new Bank();

    //create a savings account with an initial deposit of interest rate 
    SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);

    //create a current Account with and initial deposit and overdraft limit
    CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
    System.out.println("\nCurrent Account: \nInitial Deposit: $5000.00\nOverdraft Limit: $1000.00 ");

    //Add the savings account and current account to the bank
    bank.addAccount(savingsAccount);
    bank.addAccount(currentAccount);

    System.out.println("\nNow deposit $100 to Savings Account.");
    //Deposit $100 into the SavingsAccount
    bank.deposit(savingsAccount, 100.0);

    //Deposite $500 into the current account
    bank.deposit(currentAccount, 500.0);

    System.out.println("\nWithdraw $150 from Savings Account. \n");
    //Withdraw $150 from the SavingsAccount
    bank.withdraw(savingsAccount, 150.0);

    //Print the balance of all accounts in the bank
    bank.printAccountBalance();

    //Appaly interest to the savings account
    savingsAccount.applyIntrest();
    System.out.println("\nAfter applying interest on Saving A / C for 1 year:");
    System.out.println("Savings A/c and current A/c");

    //Print the balance of all accounts in the bank after applying interest
    bank.printAccountBalance();

  }
}
