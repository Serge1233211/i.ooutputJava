package prob3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {

        // Create a prob3.Person object with at least 5 fields
        Person person = new Person("John Doe", 30, "123 Main St", 1234567890L, 'M');

        // Write prob3.Person object to a file
        try (FileOutputStream fos = new FileOutputStream("person.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
            System.out.println("prob3.Person object written to person.dat successfully!");
        }
    }
}

