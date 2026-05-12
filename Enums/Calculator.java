package Enums;

enum Operation{
    PLUS {
        public double apply( double x, double y) { return x + y;}

    },
     MINUS{
        public double apply( double x, double y) { return x - y;}

    },
    TIMES {
        public double apply( double x, double y) { return x * y;}

    };

    //each content must provide an implementation for this
    public abstract  double apply(double x , double y);
}
public class Calculator {
    public static void main(String[] args) {
        double result = Operation.TIMES.apply(5,10);
        System.out.println("Result: " + result);
    }
}
