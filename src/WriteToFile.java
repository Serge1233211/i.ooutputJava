import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to write to the file: ");
        String text = scanner.nextLine();

        // Write to file
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(text);
            System.out.println("Text written to output.txt successfully!");
        }
    }
}
