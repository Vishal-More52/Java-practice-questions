

//Q 2 write a function to print the sum of all odd number from 1 to n
import java.util.Scanner;
public class oddnumbers
{
   public static void FindOddNumbers(int N){

        System.out.println("odd number from 1 to"+N+" are :");
        for(int i=0;i<N;i++)
        {
            if(i%2!=0)
            {
                System.out.println( i);
            }
        }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of N");
        int N = sc.nextInt();

        FindOddNumbers(N);
        sc.close();
    }
}