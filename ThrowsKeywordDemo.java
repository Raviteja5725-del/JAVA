class Divider {
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

public class ThrowsKeywordDemo {
    public static void main(String[] args) {
        try {
            System.out.println(Divider.divide(100, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main");
        }
    }
}
