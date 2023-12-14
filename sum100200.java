// Q11 Find the sum of all no. between 100-200 that are divisible by 7.
public class sum100200{
   public static void main(String args[]){
      int s = 100;
      int e = 200;
      int sum = 0;
      //For loop
      for(int i = s; i < e; i++){
         if(i % 7 == 0){
            sum += i;
         }
      }
      System.out.println("Sum of number between 100 and 200 that are divisible by 7 is: " + sum);
   }
}