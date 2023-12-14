//Q17 Program to find whether the given number is prime or not.

import java.util.Scanner;
public class primeQ{
   public static void main(String args[]){
      Scanner num = new Scanner(System.in);
      //Taking number from user.
      System.out.print("Please Enter a Number: ");
      int number = num.nextInt();
      
      //Checking the number is prime or not.
      int i,count = 0;
      for(i = 1; i <= number; i++){
         if(number % i == 0){
            count++;
         }
      }
      
      //Printing output 
      if(count == 2)
       System.out.println(number + " is a Prime Number.");
      else 
         System.out.println("Not a Prime Number.");
   }
}