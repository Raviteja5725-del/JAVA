import java.io.*;

public class FileExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
