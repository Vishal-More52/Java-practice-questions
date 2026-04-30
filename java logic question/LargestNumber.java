public class LargestNumber {
    public static void main(String[] args) {
        int a = 45 , b = 78, c = 23;

        if(a > b && a > c )
            System.out.println("Largest: " + a);
        else if(b > c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
    }
}
