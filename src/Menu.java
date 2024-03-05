import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        int choice = 0;
        do {
            System.out.println("Welcome to Our Simple File Reader Program");
            System.out.println("-----------------------------------------");
            System.out.println("1. Write A File");
            System.out.println("2. Read A File");
            System.out.println("3. Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Enter your choice : ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    writeFile();
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    System.out.println("Thank you for using our program.");
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    private void writeFile() {
        System.out.print("Enter file name: ");
        String fileName = scanner.next();
        scanner.nextLine();

        System.out.print("Enter content: ");
        String content = scanner.nextLine();

        WriteFile.writeFile(fileName, content);
    }

    private void readFile() {
        System.out.print("Enter file name: ");
        String fileName = scanner.next();
        ReadFile.readFile(fileName);
    }
}