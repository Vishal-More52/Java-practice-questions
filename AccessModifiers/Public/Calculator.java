package AccessModifiers.Public;


public class Calculator {
    // This variable is public (rarely recommended for variables, but possible)
    public String brand = "Casio";

    // This method is public so anyone can use the calculator
    public int add(int a, int b) {
        return a + b;
    }
}


class TestPublic {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // Accessing public variable and method from a different class
        System.out.println("Brand: " + calc.brand); 
        System.out.println("Result: " + calc.add(5, 10)); 
    }
}