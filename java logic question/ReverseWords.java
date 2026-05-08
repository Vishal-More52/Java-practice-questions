public class ReverseWords {
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) return sentence;

        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) reversed.append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I Love Java Programming"));
        // Output: Programming Java Love I
    }
}