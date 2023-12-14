// Q5 Find whether the given number is even or odd using Scanner.
import java.util.Scanner;
public class evenodd{
   public static void main(String args[]){
      Scanner number = new Scanner(System.in);
      //Taking input from user 
      System.out.println("Please Enter Your Number: ");
      int num = number.nextInt();
      
      //Finding the number is Even or Odd.
      if(num % 2 == 0){
         System.out.println(num + " is an Even Number.");
      } else 
         System.out.println(num + " is an Odd Number.");
   }
}