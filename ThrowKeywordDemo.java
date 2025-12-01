public class ThrowKeywordDemo {

    static void checkAge(int age) {
        if (age < 21) {
            throw new ArithmeticException("Age must be 21 or above");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        checkAge(18);
    }
}
