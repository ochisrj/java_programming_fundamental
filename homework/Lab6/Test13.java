// จงเขียนโปรแกรมสำหรับหาผลรวมของเลขคู่ตั้งแต่เลขจำนวนแรกจนถึงเลขจำนวนที่สอง

// โดยกำหนดให้มีเมธอด sum_even ซึ่งมีพารามิเตอร์เป็นตัวเลข 2 จำนวน และเมธอดนี้คืนค่าผลลัพธ์ที่ได้จากการคำนวณ เช่น 

//      sum_even(1, 10) = 30 ซึ่งได้มาจาก 2+4+6+8+10

//      sum_even(2, 8) = 20 ซึ่งได้มาจาก 2+4+6+8



// คำแนะนำการเขียนเมธอด sum_even : 

//  - ใช้ Math.min และ Math.max ในการหาค่าน้อยสุด และค่ามากสุด

//  - วนลูปตั้งแต่ค่าน้อยไปถึงค่ามากสุด แล้วใช้เมธอด bool is_even(int number) ในการเช็คว่าเป็นเลขคู่ ซึ่งถ้าเป็นเลขคู่ในบวกสะสมในผลลัพธ์

//  - คืนค่าผลลัพธ์

// Testset
// Example 1:
// Input:
// 1
// 10

// Output:
// 30

package Lab6;

import java.util.Scanner;

public class Test13 {
    public static boolean is_even(int number)
    {
        return number % 2 == 0;
    }

    // create sum_even method and store int start stop
    public static int sum_even(int start,int stop)
    {
        int max = Math.max(start, stop);
        int min = Math.min(start, stop);
        int sum = 0; // create sum = 0
        for(int i = min; i <= max;i++) // create for loop i 
        {
            if(is_even(i)) // check for loop i if it percent 2 equal zero
            {
                sum += i; // store i in sum and plus sum
            }
        }
        return sum; 

    }
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int num1 = lsa.nextInt(); // input num1
        int num2 = lsa.nextInt(); // input num2
        System.out.println(sum_even(num1, num2)); // print out sum_evem that input num1 num2

        lsa.close();
    }
}
