//Q4 Write a java program to evaluate roots of a quadratic equation. Take coefficients of equation as input from user.
import java.util.Scanner;
public class quadratic{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the coefficients of the quadratic equation (a, b, c): ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      
      double determinant = b * b - 4 * a * c;
      
      double root = (-b + Math.sqrt(determinant)) / (2 * a);
      double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
      System.out.println("Root 1= " + root);
      System.out.println("Root 2= " + root2);
   }
}