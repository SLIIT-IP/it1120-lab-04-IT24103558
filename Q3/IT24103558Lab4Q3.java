import java.util.Scanner;

public class IT24103558Lab4Q3 {

     public static void main(String[] args) {


         Scanner input=new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num=input.nextInt();
         String status;

         status = (num==0)? "The number is: Zero" : (num>=1)? "The number is positive":"The number is Negetive";

         System.out.println(status);

  }
} 