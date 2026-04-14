


// Q 1enter 3 numbers from the user & make finction to print their average
import java.util.Scanner;
public class avg{
   
    public static double FindAvg(double a,double b,double c)
    {
        double  sum=(a+b+c)/3;
        System.out.println("average is "+sum);
        return sum;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first nubmer  :");
        double a=sc.nextDouble();
        System.out.println("enter second number :");
        double b=sc.nextDouble();
        System.out.println("enter third number  :");
        double c=sc.nextDouble();
        FindAvg(a,b,c);
        sc.close();
    }
}