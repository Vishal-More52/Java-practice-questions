package Java8.OptionalClass;


import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] words = new String[10];

        Optional<String> checkNull = Optional.ofNullable(words[6]);

        if(checkNull.isPresent()){
            String word = words[6].toLowerCase();
            System.out.println(word);
        }
        else
            System.out.println("Word is null");
    }
}
