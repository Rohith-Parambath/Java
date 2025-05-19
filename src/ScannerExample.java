import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the User's name: ");
        String userName = scanner.nextLine();

        System.out.println("Enter the User's Age: ");
        int age = scanner.nextInt();

        System.out.println("Enter User's favorite number: ");
        int favoriteNumber = scanner.nextInt();

        System.out.println("User: " + userName + " said that his favorite number is " + favoriteNumber + " in the age of " + age);

        scanner.close();
    }
}
