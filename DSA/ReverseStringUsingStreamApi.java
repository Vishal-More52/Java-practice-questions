import java.util.stream.Stream;

public class ReverseStringUsingStreamApi {
  public static void main(String[] args) {
    
    String str = "happy weekend";

    String result = Stream.of(str.split(""))
    .reduce("",(a,b) -> b + a);

    System.out.println(result);
  }
}
