import java.io.FileReader;
import java.io.IOException;

public class Streams {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("Hello.txt")) {
            int letter = fr.read();
            while (fr.ready()) {
                System.out.println((char) letter);
                letter = fr.read();
            }
        }
        catch (IOException e) {
            System.out.println("The program seems to have encountered an IO Exception!" + e.getMessage());
        }
    }
}
