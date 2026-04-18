package Recursion;

public class ReverseString {
  
  public static void main(String[] args) {
    System.out.println(reverseString("Vishal"));
  }

  public static String reverseString(String str) {
    // Base Case
    if (str.isEmpty()) {
        return str;
    }
    // Recursive Call: Take the first char and move it to the end
    return reverseString(str.substring(1)) + str.charAt(0);
}
}
