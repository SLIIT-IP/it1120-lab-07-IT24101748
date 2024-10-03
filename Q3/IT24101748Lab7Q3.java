import java.util.Scanner;
public class IT24101748Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int customer = 1;
         double offer = 0.05;
         double total = 0;
        
        //using do-while loop to loop the proccess
        do{
        //print customer number
         System.out.println("Customer "+customer);
         
         //input total bill amount
         System.out.print("Enter total bill amount :    ");
         double amount = scanner.nextDouble();
         
         //input payment method
         System.out.print("Enter mode of payment (C for cash, o for other) : ");
         char method = scanner.next().toUpperCase().charAt(0);
         
         //checking payment type to apply disconts
         if (method=='C'){
             //calculate the discount and print discount amount
             double discount = amount * offer;
             System.out.print("Discount is : "+ discount);
              System.out.println();
             
             //calculate total amount to be paid and print total amount
             total = amount - discount;
             System.out.print("Amount to be paid : "+ total);
         }
         //checking payment type
         else if (method=='O'){
             //if payment type is not cash,print total amount and discount
             total = amount;
             System.out.print("No discount applicable");
             System.out.println();
             System.out.print("Amount to be paid : "+ total);
         }
       else {
           System.out.print("Payment Mode is not valid ");
       }
       //implement the customer number
       customer++;
       System.out.println();
       System.out.println();
        }
        while (customer<6);
    }
}
