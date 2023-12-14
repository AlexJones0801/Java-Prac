//Q7 Find the output of x+=x++*x++*x++;
public class outputx{
   public static void main(String args[]){
      int x = 6;
      x += x++ * x++ * x++;
      System.out.println("Result: " + x);
   }
}