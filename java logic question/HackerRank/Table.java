package HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class Table {
  public static void main(String[] args) throws IOException {
       int N,sum=0;
       Scanner sc= new Scanner(System.in);
       
       N=sc.nextInt();
       for(int i=1; i<=10 ; i++)
       {
           sum= N * i;
           System.out.println(N + "x" + i + "=" + sum);
       }
    }
}

