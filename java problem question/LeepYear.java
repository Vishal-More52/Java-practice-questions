import java.util.Scanner;

public class LeepYear {
  public static void main(String[] args) {
    int year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your year :");
    year = sc.nextInt();

    if(year % 2 == 0){
      System.out.println("Given year is leep year");

    }
    else{
      System.out.println("Given year is not leep year");
    }

  }
}
