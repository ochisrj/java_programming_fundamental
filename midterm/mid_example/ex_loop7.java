//     *
//    **
//   ***
//  ****
// *****

package midterm.mid_example;

public class ex_loop7 {
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println(n);
        for (int i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
