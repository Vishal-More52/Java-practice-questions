import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Keep" , "Peeks"));
        System.out.println(isAnagram("Keep" , "Peek"));
    }
}
