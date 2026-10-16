// START 

//     METHOD gcd(x y)
//         IF y IS 0:
//             RETURN x
//         IF NOT
//             RETURN gcd(x , x % y)
//     END METHOD

//     METHOD main
//         INPUT x
//         INPUT y
//         int result = gcd(x y)
//         OUTPUT "gcd " + x +" and " + y + " is : " + result
//     END METHOD

// END
package Lab6.sheetlab4;

import java.util.Scanner;

public class Test05 {
    /**
     * gcd method that use for find number that can divide number perfectly
     * @param x
     * @param y
     * @return x 
     * @return gcd(y,x % y)
     */
    public static int gcd(int x,int y) {
        if(y == 0)
        {
            return x; // use x value
        }
        else
        {
            return gcd(y,x % y); // call method to replace x to y and find reminder x
        }
    }
    /**
     * Main program
     * @param args
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int x = lsa.nextInt(); // input x
        int y = lsa.nextInt(); // input y

        int result = gcd(x, y); // call method input x y
        System.out.println("gcd " + x +" and " + y + " is : " + result); // print result
    }
}
