// จงสร้างอาร์เรย์เก็บค่าจำนวนเต็มชนิด int จำนวน n ตัวที่รับมาจาก keyboard

// บรรทัดแรกของข้อมูลเข้า คือ จำนวนข้อมูล (n)

// บรรทัดถัดมาคือ คือ ตัวเลขทั้งหมด n ตัวที่ต้องการเก็บไว้ในอาร์เรย์ จากนั้นแสดงผลลัพธ์จำนวน 4 บรรทัด ดังนี้

// ผลบวกของจำนวนเต็มทั้งหมด n จำนวน
// ค่าที่มากที่สุดของจำนวนเต็มทั้งหมด
// index ของอาร์เรย์ที่เก็บค่ามากที่สุดไว้ (ถ้าค่ามากที่สุดเท่ากันอยู่หลายที่ ตอบตำแหน่งแรกที่เจอ) โดยนับตำแหน่งแรกเป็นตำแหน่งที่ 0
// จำนวนสมาชิกที่มีค่าเท่ากับค่าที่น้อยที่สุดในอาร์เรย์
// Testset
// Example 1:
// Input:
// 5
// 1
// 3
// 2
// 5
// 1

// Output:
// 12
// 5
// 3
// 2

package Lab6;

import java.util.Scanner;

public class Test04 
{
    public static void main(String[] args) 
    {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();
        int[] Nrange = new int[n];

        int sum = 0;
        
        for (int i = 0; i < n; i++) 
        {
            Nrange[i] = lsa.nextInt();
            sum += Nrange[i];
        }

        int max = Nrange[0];
        int min = Nrange[0];
        int maxIndex = 0;

        for (int i = 0; i < n; i++) 
        {
            if (Nrange[i] > max) 
            {
                max = Nrange[i];
                maxIndex = i; 
            }
            if (Nrange[i] < min) 
            {
                min = Nrange[i];
            }
        }

        int minCount = 0;
        for (int i = 0; i < n; i++) 
        {
            if (Nrange[i] == min) 
            {
                minCount++;
            }
        }
        
        System.out.println(sum);
        System.out.println(max);
        System.out.println(maxIndex);
        System.out.println(minCount);
    }    
}
