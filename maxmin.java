//Q9 Take input of two numbers, say x and y, from user and find maximum , minimum , x raise to power y using (math function).
import java.util.Scanner;
public class maxmin{
   public static void main(String args[]){
      Scanner value = new Scanner(System.in);
      //Taking input x and y from user
      System.out.println("Please Enter the value of x: ");
      double x = value.nextInt();
      System.out.println("Please Enter the value of y: ");
      double y = value.nextInt();
      
      //Printing maximum, minimum and power of x and y.
      System.out.println("Maximum: " + Math.max(x,y));
      System.out.println("Minimum: " + Math.min(x,y));
      System.out.println("Power(x,y): " + Math.pow(x,y));
   }
}