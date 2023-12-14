//Q18 Read a number from user, display whether it is prime or not, then accept next number from user and repeat the task till user enters 0.

import java.util.Scanner;
public class primerepeat{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int number;
      
   do { //Taking number from user.
      System.out.print("Please Enter a Number: ");
      number = sc.nextInt();
      
      if(number == 0) {
         break;
      }
      //Checking the number is prime or not.
      int i,count = 0;
      for(i = 1; i <= number; i++){
         if(number % i == 0){
            count++;
         }
      }
      //Printing output 
      if(count == 2)
       System.out.println(number + " is a Prime Number.\n");
      else 
         System.out.println(number + " is not a Prime Number.\n");
      } while (number != 0);
      
      System.out.println("Existing from Program :)");
   } 
}