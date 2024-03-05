import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String fileName, String fileContent) {
        try {
            FileWriter writer = new FileWriter(fileName + ".txt");
            writer.write(fileContent);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error has occurred while writing the file.");
            e.printStackTrace();
        }
    }

    public static void updateFile(String fileName, String additionalContent) {
        try {
            FileWriter writer = new FileWriter(fileName + ".txt", true);
            writer.write("\n");
            writer.write(additionalContent);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error has occurred while updating the file.");
            e.printStackTrace();
        }
    }
}