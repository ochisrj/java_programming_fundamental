// จงเขียนโปรแกรมรับค่าจำนวนเต็ม 1 จำนวน (N) จากนั้นวนรับข้อมูลตัวเลขจำนวนเต็มอีก N จำนวน

// เมื่อรับค่าเสร็จสิ้น ให้ทำการหาผลรวมของตัวเลขทุกจำนวน ยกเว้น ตัวเลขที่มีค่าน้อยที่สุด แล้วแสดงผลลัพธ์ทางหน้าจอ

// Testset
// Example 1:
// Input:
// 5
// 45 46 78 50 62

// Output:
// 236

package Lab6;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();
        int[] Nrange = new int[n];

        for (int i = 0; i < n; i++) 
        {
            Nrange[i] = lsa.nextInt();
        }
        
        int min = Nrange[0];
        for (int i = 1; i < n; i++) 
        {
            if (Nrange[i] < min) 
            {
                min = Nrange[i];
            }
        }

        int sum = 0;
        for (int num : Nrange) 
        {
            if (num != min) 
            { 
                sum += num;
            }
        }
        
        System.out.println(sum);
        lsa.close();
    }
}
