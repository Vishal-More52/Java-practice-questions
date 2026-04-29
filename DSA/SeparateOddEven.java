import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(71,18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean , List<Integer>> partitionedNumbers = numbers.stream()
                .collect((Collectors.partitioningBy(n -> n % 2 == 0)));
        List<Integer> evenNumbers = partitionedNumbers.get(true);
        List<Integer> oddNumbers = partitionedNumbers.get(false);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd NUmbers : " + oddNumbers);
    }
}
