// Q12 Write a program for switch statement (weather forecast).
import java.util.Scanner;
public class weather{
   public static void main(String args[]){
      Scanner code = new Scanner(System.in);
      //Taking input of a weather coda from user
      System.out.println("Please Enter Weather code(1-4): ");
      int weathercode = code.nextInt();
      
      //Switch case for checking weather code
      switch(weathercode){
         case 1:
            System.out.println("Weather Forecast: Sunny");
            break;
         case 2:
            System.out.println("Weather Forecast: Cloudy");
            break;
         case 3:
            System.out.println("Weather Forecast: Rainy");
            break;
         case 4:
            System.out.println("Weather Forecast: Stormy");
            break;
         default:
            System.out.println("Invalid Weather Code.");
      }
   }
}