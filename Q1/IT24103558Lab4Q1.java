import java.util.Scanner;
public class IT24103558Lab4Q1 {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num=input.nextInt();

         if(num<0)
         { 
            System.out.println("The number is Negetive");
         }
         else if(num>0)
         {
            System.out.println("The number is Positive");
         }

        else
         {
           System.out.println("The number is Zero");
         }

  }

}

