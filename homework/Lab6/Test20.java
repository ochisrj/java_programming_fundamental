// จงเขียนโปรแกรม โดยให้มีเมธอด mul(.......) ซึ่งมีการทำงานแบบ recursion เพื่อคำนวณค่าผลคูณของตัวเลขจำนวนเต็ม 2 จำนวน เช่น mul(2,3) คือ ค่าของ 2+2+2 ซึ่งมีค่าเท่ากับ 6 เป็นต้น

// หมายเหตุ : พยายามหาผลลัพธ์โดยใช้หลักการที่ว่า a x b คือ a บวกกัน b ครั้ง

// Testset
// Example 1:
// Input:
// 2 3

// Output:
// 6

package Lab6;
/**
 * @author Kittipoom Samranjai
 * @Student-ID 69160134
 * @param RecursiveMul main program
 */
import java.util.Scanner;

public class Test20{

    /**
     * Method mul calculates the product of two integers using recursion
     * by adding a to itself b times (a x b = a + a + ... b times)
     * @param a the base integer to be repeatedly added
     * @param b the number of times a is added (must be >= 0)
     * @return result of a multiplied by b as int
     */
    public static int mul(int a, int b) {
        if (b == 0) {
            return 0; // base case: adding a zero times equals 0
        }
        return a + mul(a, b - 1); // recursive case: a + mul(a, b-1)
    }

    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int a = lsa.nextInt(); // first integer
        int b = lsa.nextInt(); // second integer

        System.out.println(mul(a, b)); // display result of recursive multiplication

        lsa.close();
    }
}