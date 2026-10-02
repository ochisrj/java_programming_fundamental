// จงเขียนโปรแกรมสำหรับพิมพ์กรอบรูปสี่เหลี่ยม โดยภายในโปรแกรมมีฟังก์ชัน (เมธอด) สำหรับพิมพ์กรอบรูป โดยเมธอดนี้จะรับค่าพารามิเตอร์ ความสูงและความกว้าง

// โดยมีส่วนหัวของเมธอดคือ void frame(int height, int length); 

// ผลลัพธ์ของฟังก์ชัน frame(3, 5) จะเป็นกรอบรูปสูง 3 บรรทัด แต่

// *****

// *   *

// *****

// Testset
// Example 1:
// Input:
// 3 5

// Output:
// *****
// *   *
// *****

package Lab6;
import java.util.Scanner;

public class Test11
{
    static void frame(int height, int length)
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < length; j++)
            {
                if (i == 0 || i == height - 1 || j == 0 || j == length - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner lsa = new Scanner(System.in);
        int height = lsa.nextInt();
        int length = lsa.nextInt();

        frame(height, length);

        lsa.close();
    }
}