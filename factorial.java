//Q14 Write a program to find factorial of the given number.
import java.util.Scanner;
public class factorial{
   public static void main(String args[]){
      Scanner num = new Scanner(System.in);
      
      System.out.print("Please Enter a Number: ");
      int n = num.nextInt();
      
      //Using for loop for calculating factorial of the given number
      int fac = 1;
      for(int i = 1; i <= n; i++){
         fac *= i; 
      }
      System.out.println("Factorial of " + n + " is: " + fac);
   }
}