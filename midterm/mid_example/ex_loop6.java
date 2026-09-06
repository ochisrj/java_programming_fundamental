//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *


package midterm.mid_example;

public class ex_loop6 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(n);
        // outer loop to handle upper part
        for (int i = 1; i <= n; i++) {
            
            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (int i = n-1; i >= 1; i--) {
            
            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }      
    }    
}
