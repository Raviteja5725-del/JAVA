public class ArrayExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 10, 15};
            System.out.println(arr[5]);   // error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
    }
}
