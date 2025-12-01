public class ArrayMultiplication {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2};
        int product = 1;

        for (int x : arr) product *= x;

        System.out.println("Product = " + product);
    }
}
