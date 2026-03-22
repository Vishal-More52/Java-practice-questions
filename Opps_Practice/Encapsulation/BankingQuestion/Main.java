package BankingQuestion;

public class Main {
    
    public static void main(String[] args) {
        
        BankAccount acc = new BankAccount("Vishal More", 5000);

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.printStatement();

        // This will throw an exception - balance is only 5500
        try{
            acc.withdraw(999999);

        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
