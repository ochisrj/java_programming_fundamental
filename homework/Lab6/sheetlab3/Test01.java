package Lab6.sheetlab3;

import java.util.Scanner;

public class Test01 
{
    // สร้างฟังก์ชันสูตรคำนวณ
    public static int Mutis(int number)
    {
        int result = 0; 
        for(int i = 1; i <= number; i++) // วนลูป i โดยต้องไม่เกินค่า number
        {
            result += i * i; // เก็บผลลัพธ์และคูณ i * i
        }
        return result; // ส่งค่าผลลัพธ์กลับไปยังเมธอด
    }
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = lsa.nextInt();
        System.out.println("Result : " + Mutis(n)); // แสดงผลและเรียกใช้ฟังก์ชัน
        
        lsa.close();
    }
}
