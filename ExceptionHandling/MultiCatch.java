package ExceptionHandling;

public class MultiCatch {
  public static void main(String[] args) {
    try {
      int[] numbers = new int[5];
      numbers[10] = 50; //Throws ArrayIndexOutOfBoundsException
    } catch (ArithmeticException e) {
      System.out.println("Math error occurred.");

    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: You accessed an index that doesn't exits .");
    }catch(Exception e){
      System.out.println("An unexpected error occurred:" + e.getMessage());
    }
  }
}
