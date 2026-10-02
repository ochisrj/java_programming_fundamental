// ห.ร.ม. (ตัวหารร่วมมาก) (Greatest Common Divisor) คือ จำนวนเต็มที่มากที่สุด ซึ่งหารเลขในกลุ่มนั้นทั้งหมดได้ลงตัว

// ค.ร.น. (ตัวคูณร่วมน้อย) (Least Common Multiple) คือ จำนวนเต็มที่มีค่าน้อยที่สุด ซึ่งเลขในกลุ่มนั้นทั้งหมดหารมันลงตัว

// จงเขียนโปรแกรมรับค่าตัวเลขจำนวนเต็มจำนวน 2 ตัว หลังจากนั้นให้คำนวณหาค่าห.ร.ม. และค.ร.น. ของเลข 2 จำนวนนั้น

// โดยกำหนดให้มีเมธอด int gcd(int x, int y) สำหรับใช้ในการค่า ห.ร.ม.

// และเมธอด int lcm(int x, int y) สำหรับใช้ในการหาค่าค.ร.น.

// วิธีการหาค่า ห.ร.ม. แบบที่ 1

// gcd(x, y)

// 1. set variable result = 1

// 2. Run a loop for x and y from 1 to max of x and y.

// 2.1 Check that the number divides both (x and y) numbers completely or not.

// - If divides completely store it in a variable .

// 3. return result



// วิธีการหาค่า ห.ร.ม. แบบที่ 2

// gcd(x, y)
// int result;
// 1. while (y != 0)
// 1.1 result = y
// 1.2 y = x mod y
// 1.3 x = result;
// 2. return x;



// วิธีการหาค่าค.ร.น. แบบที่ 1

// lcm(x, y)

// 1. set variable result to the largest of the two numbers. This is because, LCM cannot be less than the largest number.

// 2. run infinite while loop (while(true))

// 2.1 check if result perfectly divides both n1 and n2 or not.

// - If it does, found the LCM, then set result

// - else increment result by 1 and re-test the divisibility condition.

// 3. return result

// วิธีการหาค่าค.ร.น. แบบที่ 2

// lcm(x, y) = (x * y) / gcd(x,y)

// Testset
// Example 1:
// Input:
// 5
// 10

// Output:
// 5
// 10

package Lab6;

import java.util.Scanner;

public class Test15 {
    public static int gcd(int x,int y)
    {
        int result = 0;
        while (y != 0) 
        {
            result = y;
            y = x % y;
            x = result;
        }
        return  result;
    }
    public static int lcm(int x,int y)
    {
        if(x == 0 || y == 0)
        {
            return 0;
        }
        return Math.abs(x * y) / gcd(x, y);
    }
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        int num1 = lsa.nextInt();
        int num2 = lsa.nextInt();
        System.out.println(gcd(num1,num2));
        System.out.println(lcm(num1,num2));
        lsa.close();
    }
}
