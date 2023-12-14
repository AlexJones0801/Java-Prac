//Q15 Print multiplication tables from 2 up to the range given by the user.
import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Please Enter the range: ");
        int range = num.nextInt();

        // Print Multiplication table from 2 up to given range
        for (int n = 2; n <= range; n++) {
            System.out.println("Multiplication table for " + n + ": ");
            for (int m = 1; m <= 10; m++) {
                System.out.println(n + " * " + m + " = " + (n * m));
            }
            System.out.println(); // Empty line between tables for separation.
        }
    }
}
