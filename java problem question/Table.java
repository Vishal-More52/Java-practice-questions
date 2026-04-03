


import java.util.Scanner;

//this program is for displaying the table of n number

public class Table {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter you choice :");
    int num = sc.nextInt();

    for(int i =1 ;i<10 ; i++){
      int result = num * num;
      System.out.println(result);
    }
  }
}
