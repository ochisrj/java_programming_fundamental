package midterm.mid_example;

public class ex_loop9 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }

        System.out.println();
    }
}
