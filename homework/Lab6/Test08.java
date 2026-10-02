// นักเรียนที่เรียนในวิชาหลักการเขียนโปรแกรมแบ่งออกเป็น 2 กลุ่ม คือ Type 1 และ Type 0

// สมมุติว่านักเรียนนั่งเรียนโดยมีเพื่อนๆ ล้อมรอบทุกด้าน

// นักเรียนคนที่นั่งอยู่ตรงกลางจะถูกจัดกลุ่ม โดยมีเงื่อนไขดังนี้

// จัดกลุ่มเป็น Type 1 ถ้าเพื่อนที่นั่งล้อมรอบทั้งหมดเป็น Type 1
// จัดกลุ่มเป็น Type 0 ถ้าเพื่อนที่นั่งล้อมรอบส่วนใหญ่ (เกินครึ่ง) เป็น Type 0 หรือ เพื่อนที่นั่งข้างข้างทั้งซ้ายและขวาเป็น Type 0 ทั้งคู่
// จงเขียนโปรแกรมเพื่อตรวจสอบว่า นักเรียนที่นั่งตรงกลางจะถูกจัดอยู่ในกลุ่มใด (กรณีที่ไม่ตรงตามเงื่อนไขข้างต้นเลยให้ตอบเป็น X ตัวพิมพ์ใหญ่)
// | เพื่อน | เพื่อน | เพื่อน |
// | เพื่อน | นิสิต  | เพื่อน |
// | เพื่อน | เพื่อน | เพื่อน |


package Lab6;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);

        char[][] Friend = new char[3][3];
        int type0 = 0;
        int type1 = 0;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                Friend[i][j] = lsa.next().charAt(0);
            }
        }

        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0; j < 3 ; j++)
            {
                if(i ==  1 && j == 1)continue;
                if(Friend[i][j] == '1')
                {
                    type1++;
                }
                else if(Friend[i][j] == '0')
                {
                    type0++;
                }
            }
        }

        char leftF = Friend[1][0];
        char rightF = Friend[1][2];

        char NOT = 'X';

        if(type1 == 8)
        {
            NOT = '1';
        }
        else if(type0 > 4 || (leftF == '0' && rightF == '0'))
        {
            NOT = '0';
        }

        System.out.println(NOT);
    }
}
