// START

//     METHOD void dectobin(int n)
//         IF n IS NOT 0:
//             dectobin n / 2
//             OUTPUT n % 2
//     END METHOD

//     METHOD main args
//         INPUT number
//         IF number IS 0:
//             OUTPUT 0
//         ELSE:
//             METHOD dectobin(number)
//     END METHOD

// END
package Lab6.sheetlab4;

import java.util.Scanner;

public class Test04 {
    /**
     * Dectobin the binary method translater
     * @param dectobin for parameter n
     */
    public static void dectobin(int n) {
        if(n != 0) // n is not equal 0
        {
            dectobin(n / 2); // divide 2
            System.out.print(n % 2); // and find reminder
        }
    }
    /**
     * Main program
     * @param main for input number
     */
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int number = lsa.nextInt(); // input number
        if(number == 0)// number is equal 0
        {
            System.out.print(0); // print 0
        }
        else
        {
            dectobin(number); // if not call method dectobin put number in
        }
        lsa.close();
    }
}
