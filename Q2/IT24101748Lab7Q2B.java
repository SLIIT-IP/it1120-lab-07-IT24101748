public class IT24101748Lab7Q2B {
    public static void main(String[] args) {
        
        // Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print the number
            System.out.print(i + " - ");
            
            // Print stars based on the current number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}
