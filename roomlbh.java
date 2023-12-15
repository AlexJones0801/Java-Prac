//Q21 In the Q20 example declare height as one more variable declared as static, one more method get_volume and display area as well as volume of all the room objects.
import java.util.Scanner;
public class roomlbh {
   double length,breadth;
   static double height;
   
   //parameterized Constructor
   public roomlbh (double length, double breadth, double height){
      this.length = length;
      this.breadth = breadth;
      roomlbh.height = height;
   }
   double get_area() {
      return 2 * (length * breadth + breadth * height + length * height);
   }
   double get_volume() {
      return length * breadth * height;
   }
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      roomlbh[] rooms = new roomlbh[4];
      
      for(int i = 0; i < 4; i++){
         System.out.println("Enter Length, Breadth & height of Room " + (i+1) + ":");
         double length = input.nextDouble();
         double breadth = input.nextDouble();
         double height = input.nextDouble();
         rooms[i] = new roomlbh(length,breadth,height);
      }
      
      for(int i = 0;i<4;i++){
         System.out.println("\nRoom " + (i + 1) + ":");
         System.out.println("Area: " + rooms[i].get_area());
         System.out.println("Volume: " + rooms[i].get_volume());
      }
   }
}