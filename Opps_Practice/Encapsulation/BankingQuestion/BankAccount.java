// Create a BankAccount class with private balance. Add deposit, withdraw, and getBalance methods with validations.
// Easy
// Key points to cover:

// Private field: double balance
// Validate: deposit must be > 0, withdraw must not exceed balance
// No direct access to balance from outside the class

package BankingQuestion;

public class BankAccount {

    //private variables
    private String accountHolder;
    private double balance;


    //Constructor to sets initial values
    public BankAccount(String accountHolder,double initialBalance){
        //check if the balance is leseer than 0 or nagative
        if(initialBalance < 0){
            throw new IllegalArgumentException("Initial balence cannot be nagative");
        }
        // initialize variables
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    //check balence , read-only no direct access to balance
    public double getBalance(){
        return balance;
    }

    //Getter for account Holder name
    public String getAccountHolder(){
        return accountHolder;
    }

    //Deposite - validate amount before adding
    public void deposit(double amount)
    {
        if(amount <=0){
            throw new IllegalArgumentException("Deposite amount must be greater than 0");

        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance :" + balance);

    }

    // withdraw - checks two conditions before allowing
    public void withdraw(double amount)
    {
        if(amount <= 0)
        {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0");

        }
        if(amount > balance)
        {
            throw new IllegalArgumentException("Insufficient Balance");
        }

        balance -=amount;
        System.out.println("Withdrawn :" + amount + " | Remaining Balance: " + balance);
    }

    //print statement - displaing account info

    public void printStatement(){
        System.out.println("--- Account Statement ---");
        System.out.println("Holder :" + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }
}
