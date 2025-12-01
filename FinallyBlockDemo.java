public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int num = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception!");
        } finally {
            System.out.println("Finally block always runs.");
        }
    }
}
