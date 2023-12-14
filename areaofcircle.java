//Q6 Print area of a circle, radius given by the user using Scanner.
import java.util.Scanner;
public class areaofcircle{
   public static void main(String args[]){
      Scanner radius = new Scanner(System.in);
      //Taking radius from user
      System.out.print("Please Enter Radius of a Circle: ");
      double r = radius.nextDouble();
      
      //Calculating area of a circle 
      double area = Math.PI * r * r;
      
      System.out.println("The area of the circle with radius " + r + " is: " + area);
   }
}