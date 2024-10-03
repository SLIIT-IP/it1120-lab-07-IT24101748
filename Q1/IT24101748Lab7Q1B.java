import java.util.Scanner;
public class IT24101748lab7Q1B {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Loop to process grades for 3 students
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
             System.out.print("Enter Marks : ");
            
            // Read the entire line of input
            String[] marksInput = input.nextLine().split(" ");
        
            // Convert input strings to integers
            int subject1 = Integer.parseInt(marksInput[0]);
            int subject2 = Integer.parseInt(marksInput[1]);
            int subject3 = Integer.parseInt(marksInput[2]);
            int subject4 = Integer.parseInt(marksInput[3]);
            
            // Calculate the average marks
            double average = (subject1 + subject2 + subject3 + subject4) / 4.0;
            
            // Display the average
            System.out.println("Average is" + student + ": " + average);

            // Determine the grade based on the average
            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade: Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("overall Grade: Credit");
            } else if (average >= 0 && average < 50) {
                System.out.println("overall Grade: Fail");
            } else {
                System.out.println("Invalid marks entered.");
            }

            System.out.println(); // New line for clarity
        }

        // Close the input scanner
        input.close();
    }
}
