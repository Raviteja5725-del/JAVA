import java.util.Scanner;

public class NameToIntegerConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            String firstThree = name.substring(0, 3);   // may throw StringIndexOutOfBoundsException
            int value = Integer.parseInt(firstThree);   // may throw NumberFormatException

            System.out.println("Converted number = " + value);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must contain at least 3 characters!");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters must be digits!");
        }
    }
}
