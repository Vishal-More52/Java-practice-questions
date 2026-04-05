package ExceptionHandling;
class CreateThrowException {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message.");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}