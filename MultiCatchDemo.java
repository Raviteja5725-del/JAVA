public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 25 / 0;
            int[] arr = {1, 2};
            System.out.println(arr[5]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Math or array error occurred");
        }
    }
}
