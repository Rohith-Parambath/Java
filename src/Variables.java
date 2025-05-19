public class Variables {
    public static void main(String[] args) {
        int number = 11; //variable
        final double PI = 3.14159; //constant

        number = 20; // Allowed
        // PI = 3.14; // Error: Cannot change a constant

        System.out.println("Number: " + number);
        System.out.println("PI: " + PI);

    }
}
