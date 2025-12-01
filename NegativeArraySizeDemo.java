public class NegativeArraySizeDemo {
    public static void main(String[] args) {
        try {
            int size = -8;
            int[] arr = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative!");
        }
    }
}
