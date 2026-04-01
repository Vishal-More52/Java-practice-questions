import java.util.Scanner;
public class FindGretest {
   
    public static void GretestNumber(int V, int D){
        if(V > D)
        {
            System.out.println("Gretest number is "+V);

        }
        else{
            System.out.println("Gretest number is :"+D);
        }
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int V=sc.nextInt();
        System.out.println("Enter second number :");
        int D = sc.nextInt();
        GretestNumber(V, D);
        sc.close();
        
            
        
    }
}
