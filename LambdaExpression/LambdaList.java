package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaList {
  public static void main(String[] args) {
    List<String> programmingLanguages = Arrays.asList("Java", "Python", "C++", "JavaScript");

    // Using lambda to print each element
    programmingLanguages.forEach(lang -> System.out.println("Language: " + lang));
  }
}
