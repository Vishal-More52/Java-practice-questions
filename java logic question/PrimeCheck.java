public class PrimeCheck {
    public static void main(String[] args) {
        int n = 4;
        boolean isPrime = true;

        if( n <= 1) isPrime = false;

        for(int i = 2; i <= Math.sqrt(n) ; i++){
            if( n % i ==0){
                isPrime = false;
                break;
            }
        }

        System.out.println( n + " is Prime: " + isPrime);
    }
}
