public class PalindromeCheck {

    public static boolean isPalindrome(String str){
        //handle null or empty string
        if(str == null || str.isEmpty()){return true;}

        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            //if the characters don't match, Its not a palindrome
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            //move pointers
            left++;
            right--;
        }
        return true;  //all characters matched
    }

    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = " hello";

        System.out.println(test1 + " is palindrome? " + isPalindrome(test1));
        System.out.println(test2 + " is palindrome? " + isPalindrome(test2));
    }
}

