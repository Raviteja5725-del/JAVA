public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 20; // array error
            int x = 10 / 0; // arithmetic error

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (ArithmeticException e) {
            System.out.println("Math error");
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}
