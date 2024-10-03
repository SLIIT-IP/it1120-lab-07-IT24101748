public class IT24101748Lab7Q2C {
    public static void main(String[] args) {
        
        // Starting number for the pattern
        int number = 5;

        // Loop from 5 down to 1
        for (int i = number; i >= 1; i--) {
            // Print the current number, repeated (i) times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
