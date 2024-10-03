import java.util.Scanner;
public class IT24101748Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks for four subjects: ");
        
         //input number 1
       System.out.print("Enter Subject Mark 1: ");
       double number1 = scanner.nextDouble();
       
        //input number 2
       System.out.print("Enter Subject Mark 2: ");
       double number2 = scanner.nextDouble();
       
        //input number 3
       System.out.print("Enter Subject Mark 3: ");
       double number3 = scanner.nextDouble();
       
        //input number 4
       System.out.print("Enter Subject Mark 4: ");
       double number4 = scanner.nextDouble();
       
      //break line
      System.out.println();
       //calculate sum
       double sum = number1 + number2 + number3 + number4;
      
       //calculate average
       double average = sum / 4;
       System.out.println("Average: "+average);
       
       //chech grade
       if (average >= 75 && average < 100){
           System.out.println("Overall Grade is : Distinction");
       }
       else if (average >=50 && average < 75){
            System.out.println("Overall Grade is : Credit");
       }
       else if (average < 50 && average > 0){
       System.out.println("Overall Grade is : Fail");
       }
       else
       System.out.println("Invalid marks entered");
       
       
    }
}