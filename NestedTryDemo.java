public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try begins");

            try {
                int arr[] = {9, 8, 7};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: array error");
            }

            int x = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: arithmetic error");
        }
    }
}
