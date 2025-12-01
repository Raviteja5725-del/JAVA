import java.util.Scanner;

public class DynamicArrayWithException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];   // may throw NegativeArraySizeException
            System.out.println("Array of size " + size + " created successfully!");

        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
    }
}
