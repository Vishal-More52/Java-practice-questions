package Java8.StreamApi;

import java.util.stream.IntStream;

public class PrimeOrNotUsingStream {

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) {
        int[] numbersToCheck = {2,3,4,17,25,29};
        for(int num : numbersToCheck){
            System.out.println(num + " is prime? " + isPrime(num));
        }
    }
}
