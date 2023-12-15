//Q20 Rewrite program given in Q.19 Using parameterized Constructor(take lenght, breadth as parameters).
import java.util.Scanner;
public class roompara {
   double length,breadth;
   
   //parameterized Constructor
   public roompara (double length, double breadth){
      this.length = length;
      this.breadth = breadth;
   }
   double get_area() {
      return length * breadth;
   }
   double get_perimeter() {
      return 2 * (length * breadth);
   }
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      roompara[] rooms = new roompara[4];
      
      for(int i = 0; i < 4; i++){
         System.out.println("Enter Length & Breadth of the room " + (i+1) + ":");
         double length = input.nextDouble();
         double breadth = input.nextDouble();
         rooms[i] = new roompara(length,breadth);
      }
      
      for(int i = 0;i<4;i++){
         System.out.println("\nRoom " + (i + 1) + ":");
         System.out.println("Area: " + rooms[i].get_area());
         System.out.println("Perimeter: " + rooms[i].get_perimeter());
      }
   }
}