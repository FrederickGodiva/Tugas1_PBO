import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName + ".txt");
            int data  = reader.read();

            while(data != -1) {
                System.out.print((char) data);
                data  = reader.read();
            }

            System.out.println();

            reader.close();
        } catch (IOException e) {
            System.out.println("An error has occurred while reading this file.");
        }
    }
}