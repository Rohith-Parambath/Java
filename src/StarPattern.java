public class StarPattern {
    public static void main(String[] args) {
        char pattern = '*';

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pattern + " ");
            }
            System.out.println();
        }
    }
}
