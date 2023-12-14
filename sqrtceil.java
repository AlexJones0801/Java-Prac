//Q10 Take a number as input from the user and find its sqrt, abs ,ceil, floor, log (math function).
import java.util.Scanner;
public class sqrtceil{
   public static void main(String args[]){
      Scanner value = new Scanner(System.in);
      //Taking input from user 
      System.out.println("Please Enter a Number: ");
      double num = value.nextDouble();
      
      //Printing sqrt, abs, ceil, floor, log
      System.out.println("Square Root: " + Math.sqrt(num));
      System.out.println("Absolute Value: " + Math.abs(num));
      System.out.println("Ceiling Value: " + Math.ceil(num));
      System.out.println("Floor Value: " + Math.floor(num));
      System.out.println("Natural logarithm : " + Math.log(num));
   }
}