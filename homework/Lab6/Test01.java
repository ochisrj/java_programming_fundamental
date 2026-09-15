// จงเขียนโปรแกรมเพื่อรับเลขจำนวนเต็ม 1 จํานวน (n) จากนั้นวนรับเลขให้ครบ n จํานวนนั้น จากนั้นรับเลขอีก 2 จํานวน เก็บใน s และ e แทน index ของอาร์เรย์เริ่มต้นและสิ้นสุด ที่ต้องการให้แสดงค่าข้อมูลออกทางหน้าจอ

// ผลลัพธ์ของโปรแกรมมีทั้งหมด 2 บรรทัด

// บรรทัดแรกแสดงข้อมูลทั้งหมด n ตัวที่ถูกเก็บในอาร์เรย์
// บรรทัดที่สองแสดงข้อมูลตั้งแต่ index ที่ s ถึง e ทางหน้าจอ (ถ้า index ที่ผู้ใช้ป้อนมาใน s และ e ไม่อยู่ในขอบเขตของอาร์เรย์ให้แสดงข้อความว่า Your index invalid.)
// Example 1:
// Input:
// 5
// 7 9 5 3 6
// 0 2
// Output:
// 7 9 5 3 6 
// 7 9 5 
package Lab6;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner lsa = new Scanner(System.in);
        int n = lsa.nextInt();
        int[] Nrange = new int[n];
        for(int i = 0; i < n ; i++)
        {
            Nrange[i] = lsa.nextInt();
        }

        int s = lsa.nextInt();
        int e = lsa.nextInt();

        for (int i = 0; i < n; i++) 
        {
            System.out.print(Nrange[i] + (i < n - 1 ? " " : ""));
        }
        System.out.println();
        if(s < 0 || e < 0 || s >= n || e >= n || s > e)
        {
            System.out.print("Your index invalid.");
        }
        else
        {
            for(int i = s; i <= e; i++)
            {
                System.out.print(Nrange[i] + (i < e ? " " : ""));
            }
            System.out.println();
        }

        lsa.close();
    }
}
