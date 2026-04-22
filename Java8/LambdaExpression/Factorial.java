package Java8.LambdaExpression;

import java.util.function.LongUnaryOperator;
import java.util.stream.LongStream;

public class Factorial {
  public static void main(String[] args) {
    
    //lambda to calculate factorial
    LongUnaryOperator factorial = n -> LongStream.rangeClosed(1, n).reduce(1, (a,b) -> a * b);


    System.out.println("Factorial of 5: " + factorial.applyAsLong(5));
  }
}
