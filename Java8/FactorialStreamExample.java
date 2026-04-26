package Java8;

import java.util.stream.LongStream;

public class FactorialStreamExample {

    public static long calculateFactorial(int n){
        if(n < 0) throw new IllegalArgumentException("Number must be non-negative");

        return LongStream.rangeClosed(1,n)
                .reduce(1,(a,b) -> a * b);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + calculateFactorial(5));  //Output : 120
        System.out.println("Factorial of 10: " + calculateFactorial(10)); //Output: 3628800
    }
}
