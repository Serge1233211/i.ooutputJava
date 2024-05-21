import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileLineByLine {
    public static void main(String[] args) throws IOException {

        // Replace "path/to/your/file.txt" with the actual path to your file
        String filePath = "C:/Users/sknat/OneDrive/Documents/paint/ok.txt";

        // Read file line by line
        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
    }
}
