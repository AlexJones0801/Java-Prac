//Q19 Declare a class room containing length and breadth as its variables and methods get_data, get_area and get_perimeter. Create 4 objects of this room class initialize instance variables using get_data method and find area and perimeter of all the four rooms.
import java.util.Scanner;
public class roomhb {
   double length,breadth;
   
   void get_data(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Length & Breadth of the room: ");
      length = input.nextDouble();
      breadth = input.nextDouble();
   }
   double get_area() {
      return length * breadth;
   }
   double get_perimeter() {
      return 2 * (length * breadth);
   }
   public static void main(String args[]){
      roomhb[] rooms = new roomhb[4];
      
      for(int i = 0; i < 4; i++){
         rooms[i] = new roomhb();
         rooms[i].get_data();
      }
      
      for(int i = 0;i<4;i++){
         System.out.println("\nRoom " + (i + 1) + ":");
         System.out.println("Area: " + rooms[i].get_area());
         System.out.println("Perimeter: " + rooms[i].get_perimeter());
      }
   }
}