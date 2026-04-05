package ExceptionHandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Passes the message to the parent Exception class
    }
}

public class VotingSystem {
    
    static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote. Minimum age is 18.");
        }
        System.out.println("You are eligible to vote!");
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the voting system.");
        }
    }
}