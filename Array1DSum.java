public class Array1DSum {
    public static void main(String[] args) {
        int[] data = {4, 9, 2, 7};
        int sum = 0;

        for (int value : data) {
            sum += value;
        }
        System.out.println("Array Sum: " + sum);
    }
}
