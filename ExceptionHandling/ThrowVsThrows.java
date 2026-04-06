package ExceptionHandling;

public class ThrowVsThrows {
  
  //throws - declares exception 
  public void validateAge(int age) throws IllegalArgumentException{
    if(age < 18){
      throw new IllegalArgumentException("Age must be 18 + ");
    }
    System.out.println("Valid age: " + age);

  }

  public static void main(String[] args) {

    System.out.println("Starting the program...");
    ThrowVsThrows obj = new ThrowVsThrows();

    try {
        obj.validateAge(15);
    } catch (IllegalArgumentException e) {
      System.out.println("Caught: " + e.getMessage());
    }

    System.out.println("Ending the program...");
  }
}
