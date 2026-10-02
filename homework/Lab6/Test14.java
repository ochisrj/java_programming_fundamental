// จงเขียนโปรแกรมสำหรับคำนวณหาค่าแฟกทอเรียล โดยรับค่าตัวเลขจำนวนเต็ม 1 จำนวน แล้วแสดงค่าแฟกทอเรียลของเลขจำนวนนั้น

// โดยกำหนดให้มีส่วนหัวเมธอด คือ int factorial(int n)



// Note : การหาค่าแฟกทอเรียล  คือผลคูณของจำนวนเต็มบวกทั้งหมดที่น้อยกว่าหรือเท่ากับ n เขียนแทนด้วย n!

// {\displaystyle n!=n\cdot (n-1)\cdot (n-2)\cdot (n-3)\cdot \cdots \cdot 3\cdot 2\cdot 1\,.}


// ตัวอย่างเช่น

// {\displaystyle 5!=5\times 4\times 3\times 2\times 1=120\;}

// สำหรับค่าของ 0! ถูกกำหนดให้เท่ากับ 1 

// Testset
// Example 1:
// Input:
// 5

// Output:
// 120

package Lab6;

import java.util.Scanner;

public class Test14
{        
    // create factorial method
    public static int factorial(int n)
    {
        int result = 1; // create result store number
        for(int i = 1; i <= n; i++) // loop i from 1 to n
        {
            result *= i; // mutiple i
        }
        return result; // push result back to method 
    }
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        int num = lsa.nextInt(); // input num 
        System.out.println(factorial(num)); // print and calling factorial function and input num

        lsa.close();
    }
}