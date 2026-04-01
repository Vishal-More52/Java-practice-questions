
import java.util.Scanner;

public class PositiveAndNegative {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enterr your Choice :");
    int num = sc.nextInt();

    if(num>0)
    {
      System.out.println("Given number is positive ");

    }
    else if(num == 0){
        System.out.println("Given number is zero");
    }
    else{
      System.out.println("Given number is nagative :");
    }
    
  }
}
