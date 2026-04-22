package Java8.LambdaExpression;

@FunctionalInterface
interface Walker {
  int walk(int steps);
}

public class LambdaParameters {
  public static void main(String[] args) {
    Walker walker = (steps) -> {
      System.out.println("Walking " + steps + " steps...");
      return steps * 10;// returns calories burned
    };

    int calories = walker.walk(5);
    System.out.println("Calories burned: " + calories);
  }
}
