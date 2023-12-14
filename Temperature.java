// Q3 Take temperature from user in celsius and convert it to Fahrenheit.
import java.util.Scanner;
public class Temperature{
   public static void main(String args[]){
      Scanner celsius = new Scanner(System.in);
      
      //Taking input in celsius
      System.out.print("Please Enter Celsius Temperature: ");
      float c = celsius.nextFloat();
      
      //Converting to Fahrenheit 
      float Fahren = (c*9/5) + 32;
      
      System.out.println("Temperature in Fahrenheit : " + Fahren);
   }
}