
import java.util.Scanner;

public class EligibilituForVoting {
    
    public static void FindAge(int age){

        if(age> 18)
        {
            System.out.println("you are eligible for voting.....");

        }
        else{
            System.out.println("you are not eligible for voting.....");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        FindAge(age    );
        sc.close();

    }
}   
