import java.io.*;

public class FileReadWithExceptions {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample.txt");  // change file name as needed
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            System.out.println("First line: " + line);

            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        catch (IOException e) {
            System.out.println("I/O Error occurred while reading the file.");
        }
    }
}
