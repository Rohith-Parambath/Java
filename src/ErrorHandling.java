import java.util.Scanner;

class IllegalEntryException extends Exception{
    public IllegalEntryException(String message) {
        super(message);
    }
}

public class ErrorHandling {
    static void checkAge(int age) throws IllegalEntryException {
        if (age < 18) {
            throw new IllegalEntryException("You're age does'nt match the required age!");
        }
        else {
            System.out.println("Congratulation you are 18+ and are eligible for using this platform!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            checkAge(age);
        }
        catch (IllegalEntryException e) {
            System.out.println("Age does'nt match. " + e);
        }
    }
}
