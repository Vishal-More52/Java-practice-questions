public class SwapUsingXOR {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("After Swapping numbers are  A : " + a + " B :" + b );
        a = a ^ b;  //step 1
        b = a ^ b;  //Step 2: (a ^ b) ^ b -> a
        a = a ^ b;  //(a ^ b) ^ a -> b

        System.out.println("After Swapping numbers are  A : " + a + " B :" + b );
    }
}
