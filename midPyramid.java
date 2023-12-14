//Q16 Part-2 Print Pyramid Star pattern.

public class midPyramid {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            // Print spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
